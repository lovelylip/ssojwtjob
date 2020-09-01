package sso.jwt.jobme;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("sso.jwt.jobme");

        noClasses()
            .that()
                .resideInAnyPackage("sso.jwt.jobme.service..")
            .or()
                .resideInAnyPackage("sso.jwt.jobme.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..sso.jwt.jobme.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
