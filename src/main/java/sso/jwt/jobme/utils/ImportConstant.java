package sso.jwt.jobme.utils;

public class ImportConstant {
    //Bieu thuc chinh quy so thuc
    public static final String DOUBLE_REGEX = "(-)?(\\d+|(\\d|\\d\\d|\\d\\d\\d)(,\\d\\d\\d)*)(\\.\\d+)?";
    //Bieu thuc chinh quy so nguyen
    public static final String LONG_REGEX = "(-)?(\\d+|(\\d|\\d\\d|\\d\\d\\d)(,\\d\\d\\d)*)(\\.0+)?";
    public static final String NUMBER_REGEX = "^[0-9]*$";
    public static final String NUMBER_REGEX_TIEN = "^\\-?[0-9]+(\\.[0-9]+)?$";
    public static final String STRING_REGEX = ".*[^a-zA-Z].*";
    public static final String NUMBER_REGEX_0_1 = "^[0-1]*$";
    public static final String NUMBER_REGEX_1_5 = "^[1-5]*$";
    public static final String NUMBER_REGEX_0_2 = "^[0-2]*$";


    //private static final String DATE_PATTERN =
    //public static final String DATE_DDMMYYYY_REGEX = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
    public static final String DATE_DMYYYY_REGEX = "([1-9]{1})/([1-9]{1})/([0-9]{4})";
    public static final String DATE_DDMYYYY_REGEX = "([0-9]{2})/([1-9]{1})/([0-9]{4})";
    public static final String DATE_DMMYYYY_REGEX = "([1-9]{1})/([0-9]{2})/([0-9]{4})";
    public static final String DATE_DDMMYYYY_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static final String DATE_DDMMMYYYY_REGEX = "^(([0-9])|([0-2][0-9])|([3][0-1]))\\-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\-\\d{4}$";
    public static final String MONTH_MMYYYY_REGEX = "^((0[1-9])|(1[0-2]))\\/(\\d{4})$";
    public static final String YEAR_REGEX = "^[12][0-9]{3}$";

    public static final String DATE_MMYYYY_REGEX = "([0-9]{2})/([0-9]{4})";

    public static final String SQL_INSERT_IMPORT_THN = "insert into bhc_hoso_thn_temp ( ma_dvi, thang_bd  , lan_import ,hoten  ,gioitinh  ,ngaysinh  ,socmtnd  ,"
        + "sotaikhoan  ,sosobhxh  ,sotien  ,sothang  ,soqd  ,ngayhg  ,ngayqd  ,noinhan  ,huyen  ,xa  ,tothon  ,namdong  ,thangdong  ,nganhang  ,loai_bd  ,"
        + "sothang_cl  ,tien_cl  ,noidkkcbbd  ,MA_NOI_BHXH_CUOI ,atm  ,ghichu    ,thang_cat  ,nam_cat  ,loi  ,nv  ,ngay_nhap  ,stt  ,so_dt, ma_dly, noibhxh_cuoi,ma_the_kcb,ten_tk, ngay_cap_cmt, noi_cap_cmt, ma_loi_tst, loi_tst, ma_tinh   )"
        + " values (? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?, ?, ?, ?, ?, ?, ?, ?, ? , ?)";

    public static final String SQL_INSERT_IMPORT_THN_HCM = "insert into bhc_hoso_thn_temp ( ma_dvi, thang_bd  , lan_import ,hoten  ,gioitinh  ,ngaysinh  ,socmtnd  ,"
        + "sotaikhoan  ,sosobhxh  ,sotien  ,sothang  ,soqd  ,ngayhg  ,ngayqd  ,noinhan  ,huyen  ,xa  ,tothon  ,namdong  ,thangdong  ,nganhang  ,loai_bd  ,"
        + "sothang_cl  ,tien_cl  ,noidkkcbbd  ,MA_NOI_BHXH_CUOI ,atm  ,ghichu    ,thang_cat  ,nam_cat  ,loi  ,nv  ,ngay_nhap  ,stt  ,so_dt, ma_dly, noibhxh_cuoi,ma_the_kcb,ten_tk, ngay_cap_cmt, noi_cap_cmt, ma_loi_tst, loi_tst, ma_tinh, ngay_chi_tra, tu_thang, den_thang, ngay_huong, ngay_huong_plus )"
        + " values (? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?, ?, ?, ?, ?, ?, ?, ?, ? , ?, ?, ?, ?, ?, ?)";

    public static final String SQL_INSERT_IMPORT_HTHN = "insert into bhc_hthn_hs_temp ( ma_dvi  ,thang_bd  , lan_import ,ten ,ngay_sinh  ,gioi_tinh  ,"
        + "dchi  ,so_qd  ,ngay_qd  ,so_bhxh  ,tu_thang  ,den_thang  ,sothanghuong  ,so_tien  ,ma_csdtn  ,dchi_csdtn  ,loi  ,thang_cat  ,nam_cat  ,ngay_nhap  ,stt  ,"
        + " values (? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )";

    public static final String SQL_INSERT_IMPORT_BDNC = "INSERT INTO bhc_htdt_hs_temp (ma_donvi, ho_ten, so_bhxh, nghe_dt,  dchi,tu_ngay,"
        + "den_ngay,tong_so_thang,muc_ho_tro,tong_tien,lan_import,ghi_chu,loi,thangbd,so_qd, ngay_qd, tong_nguoi_qd, tong_tien_qd,loai_dc,ma_dvi,ma_cqbh,ma_tinh,nsd,ngay_nhap,loi_dl, MA_NHOM_NGHE, ID) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, BHC_HTDT_HS_TEMP_SEQ.NEXTVAL)";

    public static final String SQL_GET_LAN_IMPORT_TABLE_QD_TEMP = "Select Max(to_number(t.lan_import)) from bhc_htdt_hs_temp t where 1=1 and t.thangbd = ? and t.ma_tinh = ?";
    public static final String SQL_GET_LAN_IMPORT_TABLE_25CBH_TEMP = "Select Max(to_number(t.lan_import)) from bhc_duyet_25cbh t where 1=1 and t.thang_duyet = ? and t.ma_tinh = ?";

    public static final String SQL_GET_DOT_IMPORT = "Select t.lan_import from bhc_hoso_thn_temp t where t.thangBd = ?";
    public static final String SQL_GET_LAN_IMPORT_HTHN = "select max(to_number(t.lan_import)) from bhc_hthn_hs_temp t where t.thang_bd = ? and t.ma_tinh = ?";
    public static final String SQL_GET_LAN_IMPORT_CL = "select max(to_number(t.lan_import)) from bhc_imp_cl_temp t where t.thang_bd = ? and t.ma_tinh = ?";
    public static final String SQL_GET_LAN_IMPORT_HTHN_CHI = "select max(to_number(t.lan_import)) from bhc_hthn_chi t where t.thang_duyet = ? and t.ma_tinh = ?";
    public static final String SQL_GET_DOT_IMPORT_HTHN = "Select t.lan_import from bhc_hthn_hs_temp t where t.thangBd = ?";

    public static final String UPDATE_BCTC_THU_KYSO_HDR = "UPDATE KYSO_HDR SET NGUOI_TPTHU =?, NGAY_TPTHU=sysdate, PATH_FILE_KYSO =?, IS_KY_TPTHU = 1, PHE_DUYET_TPTHU = 1 WHERE id = ?";
    public static final String UPDATE_BCTC_THU_KYSO_HDR_PL05 = "UPDATE KYSO_HDR SET NGUOI_TPTHU =?, NGAY_TPTHU=sysdate, PATH_FILE_KYSO =?, IS_KY_TPTHU = 1, PHE_DUYET_TPTHU = 1, trang_thai = 2, trang_thai_th = 2 WHERE id = ?";
    public static final String UPDATE_BCTC_THU_KYSO_HDR_BHXHVN = "UPDATE KYSO_HDR SET NGUOI_TPTHU =?, NGAY_TPTHU=sysdate, PATH_FILE_KYSO =?, IS_KY_TPTHU = 1, PHE_DUYET_TPTHU = 1, trang_thai = 2 WHERE id = ?";
    public static final String UPDATE_BCTC_TPTD_KYSO_HDR = "UPDATE KYSO_HDR SET NGUOI_TPTD =?, NGAY_TPTD=sysdate, PATH_FILE_KYSO =?, IS_KY_TPTD = 1, PHE_DUYET_TPTD = 1 WHERE id = ?";
    public static final String UPDATE_BCTC_NL_KYSO_HDR = "UPDATE KYSO_HDR SET NGUOI_TAO =?, ngay_tao=sysdate, PATH_FILE_KYSO =?, IS_KY_NL = 1 WHERE id = ?";
    public static final String UPDATE_BCTC_GIAMDINH_KYSO_HDR = "UPDATE KYSO_HDR SET nguoi_giamdinh =?, ngay_giamdinh=sysdate, PATH_FILE_KYSO =?, is_ky_giamdinh = 1, phe_duyet_giamdinh = 1 WHERE id = ?";
    public static final String UPDATE_BCTC_VUTRUONG_KYSO_HDR = "UPDATE KYSO_HDR SET NGUOI_VUTRUONG =?, NGAY_VUTRUONG=sysdate, PATH_FILE_KYSO =?, IS_KY_VUTRUONG = 1, PHE_DUYET_VUTRUONG = 1 WHERE id = ?";
    public static final String UPDATE_BCTC_KHTC_KYSO_HDR = "UPDATE KYSO_HDR SET nguoi_tptc =?, ngay_tptc=sysdate, PATH_FILE_KYSO =?, is_ky_tptc = 1, phe_duyet_tptc = 1 WHERE id = ?";
    public static final String UPDATE_BCTC_GD_KYSO_HDR = "UPDATE KYSO_HDR SET nguoi_gd =?, ngay_gd=sysdate, PATH_FILE_KYSO =?, is_ky_gd = 1, phe_duyet_gd = 1, trang_thai = 2 WHERE id = ?";
    public static final String UPDATE_BCTC_VT_KYSO_HDR = "UPDATE KYSO_HDR SET nguoi_vt =?, ngay_vt=sysdate, PATH_FILE_KYSO =?, is_ky_vt = 1, phe_duyet_vt = 1 WHERE id = ?";
    public static final String UPDATE_BCTC_TD_KYSO_HDR = "UPDATE KYSO_HDR SET nguoi_td =?, ngay_td=sysdate, PATH_FILE_KYSO =?, is_ky_td = 1, phe_duyet_td = 1 WHERE id = ?";

    public static final String UPDATE_HUYPD_BCKS_VUTRUONG_KYSO_HDR = "UPDATE KYSO_HDR SET NGUOI_VUTRUONG =?, NGAY_VUTRUONG=sysdate, PATH_FILE_KYSO =null, IS_KY_VUTRUONG = 2, PHE_DUYET_VUTRUONG = 2, LY_DO_HUY_VUTRUONG = ? WHERE id = ?";
    public static final String UPDATE_HUYPD_BCKS_GIAMDINH_KYSO_HDR = "UPDATE KYSO_HDR SET nguoi_giamdinh =?, ngay_giamdinh=sysdate, PATH_FILE_KYSO =null, is_ky_giamdinh = 2, phe_duyet_giamdinh = 2, LY_DO_HUY = ? WHERE id = ?";
    public static final String UPDATE_HUYPD_BCKS_THU_KYSO_HDR = "UPDATE KYSO_HDR SET NGUOI_TPTHU =?, NGAY_TPTHU=sysdate, PATH_FILE_KYSO =null, IS_KY_TPTHU = 2, PHE_DUYET_TPTHU = 2, LY_DO_HUY_TPTHU = ? WHERE id = ?";
    public static final String UPDATE_HUYPD_BCKS_TPTD_KYSO_HDR = "UPDATE KYSO_HDR SET NGUOI_TPTD =?, NGAY_TPTD=sysdate, PATH_FILE_KYSO =null, IS_KY_TPTD = 2, PHE_DUYET_TPTD = 2, LY_DO_HUY_TPTD = ? WHERE id = ?";
    public static final String UPDATE_HUYPD_BCKS_KHTC_KYSO_HDR = "UPDATE KYSO_HDR SET nguoi_tptc =?, ngay_tptc=sysdate, PATH_FILE_KYSO =null, is_ky_tptc = 2, phe_duyet_tptc = 2, LY_DO_HUY_TPTC = ? WHERE id = ?";
    public static final String UPDATE_HUYPD_BCKS_GD_KYSO_HDR = "UPDATE KYSO_HDR SET nguoi_gd =?, ngay_gd=sysdate, PATH_FILE_KYSO =null, is_ky_gd = 2, phe_duyet_gd = 2, LY_DO_HUY_GD = ? WHERE id = ?";
    public static final String UPDATE_HUYPD_BCKS_VT_KYSO_HDR = "UPDATE KYSO_HDR SET nguoi_vt =?, ngay_vt=sysdate, PATH_FILE_KYSO =null, is_ky_vt = 2, phe_duyet_vt = 2, LY_DO_HUY_VT = ? WHERE id = ?";
    public static final String UPDATE_HUYPD_BCKS_TD_KYSO_HDR = "UPDATE KYSO_HDR SET nguoi_td =?, ngay_td=sysdate, PATH_FILE_KYSO =null, is_ky_td = 2, phe_duyet_td = 2, LY_DO_HUY_TD = ? WHERE id = ?";

    public static final String SQL_INSERT_ODTS_QT_IMPORT = "INSERT INTO ODTS_QTTHAMGIA_TEMP(" +
        "SO_BHXH, " +
        "MA_DVI, " +
        "TEN_DONVI, " +
        "MA_CQBH, " +
        "TU_THANG, " +
        "DEN_THANG, " +
        "HSL, " +
        "PCKV, " +
        "PCKV_07, " +
        "PCVK, " +
        "PCCV, " +
        "ML, " +
        "PC_NGHE, " +
        "PA, " +
        "DK_KHAITHACTHAN, " +
        "PC_KHAC, " +
        "NOI_LAMVIEC, " +
        "LOAI_DONG, " +
        "DK_NNDH, " +
        "DK_DBNNDH, " +
        "SO_THANG, " +
        "NGUOI_TAO, " +
        "PC_LUONG, " +
        "PC_BOSUNG, " +
        "DA_NGHI_VIEC" +
        ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public static final String SQL_UPDATE_ODTS_IMPORT = "UPDATE ODTS_XETDUYETCHEDO_TEMP SET " +
        "HS_ID= ?," +
        "MA_CD= ?," +
        "MA_NHOMHUONG= ?," +
        "NGAY_DC= ?," +
        "NGUOI_DC= ?," +
        "LOAI_DT= ?," +
        "HO_TEN= ?," +
        "MUC_LUONG= ?," +
        "TU_NGAY= ?," +
        "DEN_NGAY= ?," +
        "TU_NGAYH= ?," +
        "DEN_NGAYH= ?," +
        "SO_TIEN= ?," +
        "SO_TIENH= ?," +
        "SO_NGAY= ?," +
        "SO_NGAYH= ?," +
        "MA_NGOAITE= ?," +
        "SONGAY_LUYKE= ?," +
        "SOTHANG_BH= ?," +
        "SONAM_BH= ?," +
        "TUOI_CON= ?," +
        "STT_CON= ?," +
        "GIOI_TINH= ?," +
        "DK_BENHDAINGAY= ?," +
        "DK_PHAUTHUAT= ?," +
        "DK_NGHIONHA= ?," +
        "DK_SUYGIAMLD= ?," +
        "DK_CA_3= ?," +
        "MA_TINH= ?," +
        "MA_HUYEN= ?," +
        "LOAI_DC= ?," +
        "LYDO_DC= ?," +
        "GHICHU_DC= ?," +
        "LOAI_BENH= ?," +
        "TUYEN_BV= ?," +
        "LBQ_HS= ?," +
        "LBQ_ML= ?," +
        "TRO_CAP= ?," +
        "TRO_CAPH= ?," +
        "TI_LEH= ?," +
        "NGAY_NUOI= ?," +
        "SONGAY_CHEDO= ?," +
        "NGAY_NGHILIST= ?," +
        "TUNGAY_BS= ?," +
        "DEN_NGAYBS= ?," +
        "DUYET_BOSUNG= ?," +
        "TRANG_THAI= ?," +
        "NGAY_SINH= ?," +
        "SO_CMND= ?," +
        "TUOI_THAI= ?," +
        "SO_CON= ?," +
        "SO_THAILUU= ?," +
        "NGAY_SINHCON= ?," +
        "SO_NGAYBS= ?," +
        "SO_TIEN_BS= ?," +
        "DK_NNDH= ?," +
        "PCKV_07= ?," +
        "DK_SINHCON= ?," +
        "TEN_CON= ?," +
        "DK_DBNNDH= ?," +
        "DC_LAN= ?," +
        "NGAY_TAO= ?," +
        "NGUOI_TAO= ?," +
        "TEN_DONVI= ?," +
        "DK_LVBT= ?," +
        "GHICHU= ?," +
        "LUONG_CB= ?," +
        "CHI_TAI= ?," +
        "THOI_DIEM= ?," +
        "NGAY_CHUYEN= ?," +
        "NGUOI_CHUYEN= ?," +
        "MANG_THAI_HO= ?," +
        "HINH_THUC= ?," +
        "STT= ?," +
        "NHAP_TAY= ?," +
        "NGAY_HUY= ?," +
        "NGUOI_HUY= ?," +
        "CMND_VO= ?," +
        "HOTEN_VO= ?," +
        "MA_NHH_CHA= ?," +
        "DOTQT_ID= ?," +
        "LAN_CHUYEN= ?," +
        "NGAY_GIAO_CON= ?," +
        "HS_ID_BS= ?," +
        "NGHI_DUONG_THAI= ?," +
        "TINH_TRANG= ?," +
        "SO_BHXH_ME= ?," +
        "SO_NGAYH_CU= ?," +
        "NGAY_NGHI= ?," +
        "BIEN_PHAP= ?," +
        "NGAY_ME_CHET= ?," +
        "CHA_NGHI_CHAM_CON= ?," +
        "NGAY_CON_CHET= ?," +
        "TUOI= ?," +
        "NGAY_SUA= ?," +
        "DK_KHAMTHAI= ?," +
        "MA_QT_DC= ?," +
        "SO_TAIKHOAN= ?," +
        "TEN_TAIKHOAN= ?," +
        "MA_NGANHANG= ?," +
        "ID_XD_CU= ?," +
        "KEYSL= ?," +
        "DUYET_SAI= ?," +
        "DOT_BO_SUNG= ?," +
        "LOI_DULIEU= ?," +
        "IMPORT_LAN= ?," +
        "MA_LOI= ?," +
        "SONAM_BH_VO= ?," +
        "SOTHANG_BH_VO= ?," +
        "MUC_LUONG_VO= ?," +
        "LBQ_HS_VO= ?," +
        "LBQ_ML_VO= ?," +
        "MA_CQBH_VO= ?," +
        "IS_LOI= ? " +
        " WHERE MA_CQBH=? AND MA_DVI=? AND MA_QT=? AND SO_BHXH=? AND NGUOI_DUYET=?";

    public static final String SQL_UPDATE_DM_NGANHANG_MOI = "UPDATE dm_nganhang_moi SET MA_NH_CU = ? where MA_NH_BHXH = ? and MA_TINH = ? ";
    public static final String SQL_UPDATE_DM_NGANHANG = "UPDATE dm_nganhang SET MA_NGAN_HANG = ? where MA = ? and MA_TINH = ? ";
    public static final String SQL_INSERT_DM_NGANHANG_MOI = "INSERT INTO DM_NGANHANG_MOI(ID,MA_NH_BHXH, MA_NH_NN, MA_CHA, TEN, CHI_NHANH, MA_TINH, MA_NH_CU) " +
        "VALUES(dm_nganhang_moi_seq.nextval,?,?,?,?,?,?,?) ";

    public static final String SQL_UPDATE_MASO_BHXH_BHC_HOSO = "UPDATE BHC_HOSO SET MA_SO_BHXH = ? , MA_THE = ? , MA_LOAI_DT_KCB = ? , MA_LOAI_QL = ?" +
        "   WHERE MA_TINH = substr(?,2,2) and MA_DVI = ?  and SO_BHXH = ?  and MA_SO_BHXH is null "
        + "     AND FN_CONVERT_TO_VN(ten) =  FN_CONVERT_TO_VN( ? )"
        ;
    public static final String SQL_UPDATE_MASO_BHXH_BHC_BAOCAO = "UPDATE BHC_BAOCAO SET MA_SO_BHXH = ? , MA_THE = ? where MA_TINH = substr(?,2,2) and MA_DVI = ?  and SOSO = ? " +
        "   AND FN_CONVERT_TO_VN(HOTEN) =  FN_CONVERT_TO_VN( ? ) and MA_SO_BHXH is null "
        ;
    public static final String SQL_UPDATE_MASO_BHXH_BHC_TUAT = " UPDATE BHC_TUAT_DXT a SET SO_DINH_DANH = ?, MA_THE = ?, MA_LOAI_QL = ? " +
        "  WHERE MA_TINH = substr(?,2,2) and SO_DINH_DANH is null " +
        "        AND upper(ho_ten) =  upper( ? ) " +
        "        AND EXISTS ( "
        + "         SELECT 1 " +
        "           FROM  bhc_hoso b " +
        "           WHERE b.ma_tinh = substr(?,2,2) " +
        "                 AND b.loai in ('60','70','80') " +
        "                 AND b.so_bhxh = ? " +
        "                 AND b.so_id = a.so_id " +
        "       )" ;

    public static final String SQL_INSERT_ODTS_IMPORT = "INSERT INTO ODTS_XETDUYETCHEDO_TEMP(" +
        "HS_ID," +
        "SO_BHXH," +
        "MA_DVI," +
        "MA_QT," +
        "MA_CD," +
        "MA_NHOMHUONG," +
        "NGAY_DUYET," +
        "NGUOI_DUYET," +
        "NGAY_DC," +
        "NGUOI_DC," +
        "LOAI_DT," +
        "HO_TEN," +
        "MUC_LUONG," +
        "TU_NGAY," +
        "DEN_NGAY," +
        "TU_NGAYH," +
        "DEN_NGAYH," +
        "SO_TIEN," +
        "SO_TIENH," +
        "SO_NGAY," +
        "SO_NGAYH," +
        "MA_NGOAITE," +
        "SONGAY_LUYKE," +
        "SOTHANG_BH," +
        "SONAM_BH," +
        "TUOI_CON," +
        "STT_CON," +
        "GIOI_TINH," +
        "DK_BENHDAINGAY," +
        "DK_PHAUTHUAT," +
        "DK_NGHIONHA," +
        "DK_SUYGIAMLD," +
        "DK_CA_3," +
        "MA_TINH," +
        "MA_HUYEN," +
        "LOAI_DC," +
        "LYDO_DC," +
        "GHICHU_DC," +
        "LOAI_BENH," +
        "TUYEN_BV," +
        "LBQ_HS," +
        "LBQ_ML," +
        "TRO_CAP," +
        "TRO_CAPH," +
        "TI_LEH," +
        "NGAY_NUOI," +
        "SONGAY_CHEDO," +
        "NGAY_NGHILIST," +
        "TUNGAY_BS," +
        "DEN_NGAYBS," +
        "DUYET_BOSUNG," +
        "TRANG_THAI," +
        "NGAY_SINH," +
        "SO_CMND," +
        "TUOI_THAI," +
        "SO_CON," +
        "SO_THAILUU," +
        "NGAY_SINHCON," +
        "SO_NGAYBS," +
        "SO_TIEN_BS," +
        "DK_NNDH," +
        "PCKV_07," +
        "DK_SINHCON," +
        "TEN_CON," +
        "MA_CQBH," +
        "DK_DBNNDH," +
        "DC_LAN," +
        "NGAY_TAO," +
        "NGUOI_TAO," +
        "TEN_DONVI," +
        "DK_LVBT," +
        "GHICHU," +
        "LUONG_CB," +
        "CHI_TAI," +
        "THOI_DIEM," +
        "NGAY_CHUYEN," +
        "NGUOI_CHUYEN," +
        "MANG_THAI_HO," +
        "HINH_THUC," +
        "STT," +
        "NHAP_TAY," +
        "NGAY_HUY," +
        "NGUOI_HUY," +
        "CMND_VO," +
        "HOTEN_VO," +
        "MA_NHH_CHA," +
        "DOTQT_ID," +
        "LAN_CHUYEN," +
        "NGAY_GIAO_CON," +
        "HS_ID_BS," +
        "NGHI_DUONG_THAI," +
        "TINH_TRANG," +
        "SO_BHXH_ME," +
        "SO_NGAYH_CU," +
        "NGAY_NGHI," +
        "BIEN_PHAP," +
        "NGAY_ME_CHET," +
        "CHA_NGHI_CHAM_CON," +
        "NGAY_CON_CHET," +
        "TUOI," +
        "NGAY_SUA," +
        "DK_KHAMTHAI," +
        "MA_QT_DC," +
        "SO_TAIKHOAN," +
        "TEN_TAIKHOAN," +
        "MA_NGANHANG," +
        "ID_XD_CU," +
        "KEYSL," +
        "DUYET_SAI," +
        "DOT_BO_SUNG," +
        "LOI_DULIEU," +
        "IMPORT_LAN," +
        "MA_LOI," +
        "SONAM_BH_VO," +
        "SOTHANG_BH_VO," +
        "MUC_LUONG_VO," +
        "LBQ_HS_VO," +
        "LBQ_ML_VO," +
        "MA_CQBH_VO" +
        ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?" +
        ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String SQL_UPDATE_ATM_HSCN = "UPDATE ODTS_HOSOCN SET so_tai_khoan=?, ma_ngan_hang=?, ten_ngan_hang=?, ten_chu_tai_khoan=?, ma_tinh_nh=? WHERE MA_CQBH=? AND SO_BHXH=?";

    public static final String SQL_INSERT_ODTS_IMPORT_ONE = "INSERT INTO ODTS_XETDUYETCHEDO_TEMP(" +
        "HS_ID," +
        "SO_BHXH," +
        "MA_DVI," +
        "MA_QT," +
        "MA_CD," +
        "MA_NHOMHUONG," +
        "NGAY_DUYET," +
        "NGUOI_DUYET," +
        "NGAY_DC," +
        "NGUOI_DC," +
        "LOAI_DT," +
        "HO_TEN," +
        "MUC_LUONG," +
        "TU_NGAY," +
        "DEN_NGAY," +
        "TU_NGAYH," +
        "DEN_NGAYH," +
        "SO_TIEN," +
        "SO_TIENH," +
        "SO_NGAY," +
        "SO_NGAYH," +
        "MA_NGOAITE," +
        "SONGAY_LUYKE," +
        "SOTHANG_BH," +
        "SONAM_BH," +
        "TUOI_CON," +
        "STT_CON," +
        "GIOI_TINH," +
        "DK_BENHDAINGAY," +
        "DK_PHAUTHUAT," +
        "DK_NGHIONHA," +
        "DK_SUYGIAMLD," +
        "DK_CA_3," +
        "MA_TINH," +
        "MA_HUYEN," +
        "LOAI_DC," +
        "LYDO_DC," +
        "GHICHU_DC," +
        "LOAI_BENH," +
        "TUYEN_BV," +
        "LBQ_HS," +
        "LBQ_ML," +
        "TRO_CAP," +
        "TRO_CAPH," +
        "TI_LEH," +
        "NGAY_NUOI," +
        "SONGAY_CHEDO," +
        "NGAY_NGHILIST," +
        "TUNGAY_BS," +
        "DEN_NGAYBS," +
        "DUYET_BOSUNG," +
        "TRANG_THAI," +
        "NGAY_SINH," +
        "SO_CMND," +
        "TUOI_THAI," +
        "SO_CON," +
        "SO_THAILUU," +
        "NGAY_SINHCON," +
        "SO_NGAYBS," +
        "SO_TIEN_BS," +
        "DK_NNDH," +
        "PCKV_07," +
        "DK_SINHCON," +
        "TEN_CON," +
        "MA_CQBH," +
        "DK_DBNNDH," +
        "DC_LAN," +
        "NGAY_TAO," +
        "NGUOI_TAO," +
        "TEN_DONVI," +
        "DK_LVBT," +
        "GHICHU," +
        "LUONG_CB," +
        "CHI_TAI," +
        "THOI_DIEM," +
        "NGAY_CHUYEN," +
        "NGUOI_CHUYEN," +
        "MANG_THAI_HO," +
        "HINH_THUC," +
        "STT," +
        "NHAP_TAY," +
        "NGAY_HUY," +
        "NGUOI_HUY," +
        "CMND_VO," +
        "HOTEN_VO," +
        "MA_NHH_CHA," +
        "DOTQT_ID," +
        "LAN_CHUYEN," +
        "NGAY_GIAO_CON," +
        "HS_ID_BS," +
        "NGHI_DUONG_THAI," +
        "TINH_TRANG," +
        "SO_BHXH_ME," +
        "SO_NGAYH_CU," +
        "NGAY_NGHI," +
        "BIEN_PHAP," +
        "NGAY_ME_CHET," +
        "CHA_NGHI_CHAM_CON," +
        "NGAY_CON_CHET," +
        "TUOI," +
        "NGAY_SUA," +
        "DK_KHAMTHAI," +
        "MA_QT_DC," +
        "SO_TAIKHOAN," +
        "TEN_TAIKHOAN," +
        "MA_NGANHANG," +
        "ID_XD_CU," +
        "KEYSL," +
        "DUYET_SAI," +
        "DOT_BO_SUNG," +
        "LOI_DULIEU," +
        "IMPORT_LAN," +
        "MA_LOI," +
        "SONAM_BH_VO," +
        "SOTHANG_BH_VO," +
        "MUC_LUONG_VO," +
        "LBQ_HS_VO," +
        "LBQ_ML_VO," +
        "MA_CQBH_VO," +
        "MA_BENH," +
        "DUYET_SAI_BOSUNG," +
        "TEN_NGANHANG," +
        "SO_KCB," +
        "TU_NGAY_THE," +
        "DEN_NGAY_THE," +
        "MA_BV," +
        "SO_THANG_TG," +
        "LUONG_CU," +
        "MA_TINH_NH," +
        "NHO_MTH," +
        "NGAY_GIAM_DINH," +
        "PHI_GD," +
        "MA_THE_BHYT," +
        "SERI_CT," +
        "SO_BHXH_CON," +
        "MA_THE_BHYT_CON," +
        "ME_RUIRO," +
        "SO_HO_SO," +
        "ID" +
        ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?" +
        ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?," +
        "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,odts_xetduyetchedo_seq.nextval)";
    public static final String SQL_GET_LAN_IMPORT_ODTS = "select max(t.import_lan) from ODTS_XETDUYETCHEDO_TEMP t where t.MA_QT = ?";

    public static final String IMPORT_SUCCESS = "SUCCESS";
    public static final String IMPORT_FAIL = "FAIL";
    public static final String IMPORT_FAIL_HEADER = "FAILHEADER";
    public static final String XOA_SUCCESS = "XOA_SUCCESS";
    public static final String XOA_EXISTS = "XOA_EXISTS";
    public static final String XOA_FAIL = "XOA_FAIL";
    public static final String UPDATE_SUCCESS = "UPDATE_SUCCESS";
    public static final String UPDATE_FAIL = "UPDATE_FAIL";
    public static final String IMPORT_ALL_SUCCESS = "IMPORT_ALL_SUCCESS";
    public static final String IMPORT_VALID_BUSSINESS_SUCCESS = "VALID_DONE";
    public static final String IMPORT_PROCESSING = "PROCESSING";
    public static final String RES_LAN_IMPORT = "lanImport";
    public static final String SO_QD_NOT_EXISTED = "not_existed";
    public static final String MA_NGOAI_TE = "VND";

    public static final Integer LAN_IMPORT = 1;

    public interface MA_TINH{
        String HCM = "79";
    }
    public interface TYPE {
        String LONG_ARRAY = "LONG_ARRAY";
        String STRING_ARRAY = "STR_ARRAY";
    }
    public interface LOAI_BD_HCM {
        String TB = "TB";
        String BS = "BS";
    }

    //cot excel import hcm
    public interface IMP_HCM_TB{
        Integer COL_STT = 0;
        Integer COL_HOTEN = 1;
        Integer COL_SO_BHXH = 2;
        Integer COL_CMT = 3;
        Integer COL_SO_QD = 4;
        Integer COL_SO_TIEN = 5;
        Integer COL_NGAY_HG = 6;
    }

    public interface IMP_HCM_BS{
        Integer COL_STT = 0;
        Integer COL_HOTEN = 1;
        Integer COL_SO_BHXH = 2;
        Integer COL_SO_QD = 3;
        Integer COL_SO_CMTND = 4;
        Integer COL_SO_TIEN = 5;
        Integer COL_TU_THANG = 6;
        Integer COL_DEN_THANG = 7;
        Integer COL_SO_THANG = 8;
        Integer COL_TONG_TIEN = 9;
    }

    public interface IMP_BDNC_HS {
        Integer COL_STT = 0;
        Integer COL_HOTEN = 1;
        Integer COL_SO_BHXH = 2;
        Integer COL_NGHE_DT = 3;
        Integer COL_MA_NHOM_NGHE = 4;
        Integer COL_DCHI = 5;
        Integer COL_TU_NGAY = 6;
        Integer COL_DEN_NGAY = 7;
        Integer COL_SO_THANG = 8;
        Integer COL_MUC_HO_TRO = 9;
        Integer COL_TONG_TIEN = 10;
//        Integer COL_SO_QD = 10;
//        Integer COL_MA_DVI = 11;
//        Integer COL_TEN_DVI = 12;

    }

    public interface IMP_CHAM_LINH {
        Integer COL_SO_TT = 0;
        Integer COL_HO_TEN = 1;
        Integer COL_SO_BHXH = 2;
        Integer COL_THANG_CL = 3;
        Integer COL_SO_TIEN_CL = 4;
        Integer COL_LY_DO = 5;
    }

    public interface DUYET_25CBH {
        Integer COL_HO_TEN = 0;
        Integer COL_SO_BHXH = 1;
        Integer COL_SO_THANG = 2;
        Integer COL_MUC_HO_TRO = 3;
        Integer COL_TONG_HO_TRO = 4;
    }


    public interface IMP_BDNC_STATUS {
        String SUCCESS = "success";
        String ERROR = "error";
    }

    public interface EXPORT {
        String FOLDER_TEMPLATE = "/excel/";
        String FOLDER_TEMPLATE_ODTS = "/excel/odts/";
        String FOLDER_TEMPLATE_CHT = "/excel/hangThang/";
        String FOLDER_TEMPLATE_DM = "/excel/dm/";
        String DEFAULT = "";
        String FOLDER_TEMPLATE_BCTHU = "/excel/bcthu/";
        String FOLDER_TEMPLATE_BCCSYT = "/excel/bccsyt/";

    }

    public interface TEMPLATE_NAME {
        String IMPORT_CHI_PHI_KHANG_HIV = "Đồng bộ chi phí kháng HIV";
        String IMPORT_DULIEU_THAMDINH_M02a = "Import dữ liệu thẩm định M02a";
        String IMPORT_DULIEU_THAMDINH_M02b = "Import dữ liệu thẩm định M02b";
        String IMPORT_DULIEU_THAMDINH_M02c = "Import dữ liệu thẩm định M02b";
    }

    public interface FILE_EMPLATE {
        String DEFAULT = "";
        String IMPORT_CHI_PHI_KHANG_HIV = "FileImportChiPhiKhangHIV.xlsx";
        String IMPORT_DULIEU_THAMDINH_M02a = "FileImportDulieuThamDinhM02a.xlsx";
        String IMPORT_DULIEU_THAMDINH_M02b = "FileImportDulieuThamDinhM02b.xlsx";
        String IMPORT_DULIEU_THAMDINH_M02c = "FileImportDulieuThamDinhM02c.xlsx";
    }

    public interface IMPORT_ODTS_HSCN {
        String MACQBH = "MA CO QUAN BHXH";
        String SOCMND = "SO CMND";
        String SOTK = "SO TAI KHOAN";
        String TENTK = "TEN CHU TAI KHOAN";
        String SOBHXH = "SO SO BHXH";
        String MANGHANG = "MA NGAN HANG";
        String MATINHNGANHANG = "MA TINH NGAN HANG";
    }
    public interface IMPORT_DM_NGAN_HANG_MAP {
        String MANHCU = "MA NGAN HANG CU";
        String MATINH = "MA TINH";
        String MANHBHXH = "MA NGAN HANG MOI";
        String MACHA = "MA CHA";
        String MANHNN = "MA NGAN HANG NHA NUOC";
        String TENNH = "TEN NGAN HANG";
        String CHINHANH = "CHI NHANH";
    }

    public interface IMPORT_DONG_BO_MA_SO_BHXH {
        String SOBHXH = "SO BHXH";
        String HOTEN = "HO TEN";
        String NGAYSINH = "NGAY SINH";
        String MADONVI = "MA DON VI";
        String DONVICONGTAC = "DON VI CONG TAC";
        String MALOAIDONVI = "MA LOAI DON VI";
        String MACHEDO = "MA CHE DO";
        String LOAIDC = "LOAI DC";
        String THANGDC = "THANG DC";
        String NGAYDC = "NGAY DC";
        String TIENDC = "TIEN DC";
        String DLYCAP1 = "D/LY CAP 1";
        String DLYCAP2 = "D/LY CAP 2";
        String DLYCAP3 = "D/LY CAP 3";
        String FSHDT = "FSHDT";
        String NSD = "NSD";
        String MASOBHXH = "MA SO BHXH";
        String MATHE = "MA THE";
        String MAQUYENLOI = "MA QUYEN LOI KCB";
        String LOAIDOITUONG = "LOAI DOI TUONG KCB";
        String CMT = "CMT";
    }

    public interface IMPORT_DM_DONVI {
        String MACQBH = "MA CO QUAN BHXH";
        String MADV = "MA DON VI";
        String TENDV = "TEN DON VI";
        String SOTK = "SO TAI KHOAN";
        String MANGHANG = "MA NGAN HANG";
        String NGAYNGHIDV = "NGAY NGHI DON VI";
    }

    public interface IMPORT_THN_HCM{
        String TB = "4";
        String BS = "5";
    }

    public interface IMP_ODTS {
        String SOHOSO  = "SOHOSO";
        String MADVI = "MA DON VI";
        String MANHOMHUONG = "MA NHOM HUONG";
        String HOTEN = "HO TEN";
        String TUNGAY = "TU NGAY DON VI DE NGHI";
        String LYDODIEUCHINH = "LY DO DIEU CHINH";
        String SONGAY = "SO NGAY DON VI DE NGHI";
        String DKPHAUTHUAT = "PHAU THUAT/THAI DUOI 32 TUAN";
        String DKSUYGIAMLD = "TY LE SUY GIAM";
        String TUYENBV = "TUYEN BENH VIEN";
        String NGAYNUOI = "NGAY NHAN NUOI";
        String NGAYNGHILIST = "NGAY NGHI TUAN";
        String TUNGAYBS = "TU NGAY BAC SI";
        String DENNGAYBS = "DEN NGAY BAC SI";
        String TUOITHAI = "TUOI THAI (TUAN)";
        String SOCON = "SO CON";
        String NGAYSINHCON = "NGAY SINH CUA CON";
        String DOTBOSUNG = "DOT BO SUNG";
        String DKLVBT = "DIEU KIEN LAM VIEC";
        String DKSINHCON2 = "DIEU KIEN SINH CON";
        String THOIDIEM = "NGAY GIAM DINH";
        String STT = "SO THU TU";
        String SOBHXHME = "SO SO BHXH/ SO CMND CUA ME";
        String CHANGHICHAMCON = "CHA NGHI CHAM CON";
        String BIENPHAP = "BIEN PHAP KHHGD";
        String NGAYGIAOCON = "NGAY DI LAM THUC TE";
        String NGHIDUONGTHAI = "NGHI DUONG THAI";
        String NGAYCONCHET = "NGAY CON CHET";
        String DKKHAMTHAI = "DIEU KIEN KHI KHAM THAI";
        String MASONHANVIEN = "MA SO NHAN VIEN";
        String COQUANBHXH = "CO QUAN BHXH";
        String SOSOBHXH = "SO SO BHXH";
        String SOCMND = "SO CMND";
        String TENCHUTAIKHOAN = "TEN CHU TAI KHOAN";
        String SOTAIKHOAN = "SO TAI KHOAN";
        String LOAIDOANHNGHIEP = "LOAI DOANH NGHIEP";
        String NGAYNGHIDONVI = "NGAY NGHI DON VI";
        String MANGANHANG = "MA NGAN HANG";
        String TENNGANHANG = "TEN NGAN HANG";
        String MABENHDAINGAY = "MA BENH DAI NGAY";
        String DUYETSAI = "DUYET SAI";
        String HINHTHUC = "HINH THUC NHAN";
        String MA_TINH_NGAN_HANG = "MA TINH NGAN HANG";
        //QD166
        String SOSERICUACHUNGTU = "SO SERI CUA CHUNG TU";
        String MATHEBHYTCON = "MA THE BHYT CON";
        String MASOBHXHME = "MA SO BHXH ME";
        String MASOBHXHCON = "MA SO BHXH CON";
        String MATHEBHYTME = "MA THE BHYT ME";
        String SOCMNDCUAME = "SO CMND CUA ME";
        String MANGTHAIHO = "MANG THAI HO";
        String PHIGIAMDINHYKHOA = "PHI GIAM DINH Y KHOA";
    }

    public interface MANHOMHUONG {
        String NHOM_O1 = "O1"; // ban than om
        String NHOM_O2 = "O2"; // con om
        String NHOM_O3 = "O3"; // om dai ngay
        String NHOM_T1 = "T1"; // kham thai
        String NHOM_T10 = "T10"; // Mang thai ho
        String NHOM_T11 = "T11"; // Nho mang thai ho
        String NHOM_T12 = "T12"; // nam nghi viec khi vo sinh
        String NHOM_T13 = "T13"; // nam huong tro cap 1 lan khi vo sinh
        String NHOM_T2 = "T2"; // say thai
        String NHOM_T3 = "T3"; // bien phap kham thai
        String NHOM_T4 = "T4"; // Sinh con
        String NHOM_T6 = "T6"; // con chet sau sinh
        String NHOM_T7 = "T7"; // me chet sau sinh
        String NHOM_T8 = "T8"; // nuoi con
        String NHOM_D101 = "D101";
        String NHOM_D102 = "D102";
        String NHOM_D103 = "D103";
        String NHOM_D201 = "D201";
        String NHOM_D202 = "D202";
        String NHOM_D203 = "D203";
        String NHOM_D204 = "D204";
        String NHOM_D301 = "D301";
        String NHOM_D302 = "D302";
        String NHOM_D303 = "D303";
        String NHOM_DS = "|D101|D102|D103|D201|D202|D203|D204|D301|D302|D303|";
        String NHOM_D101to204 = "|D101|D102|D103|D201|D202|D203|D204|";
        String NHOM_D301to303 = "|D301|D302|D303|";
        String NHOM_OM = "|O1|O2|O3|";
        String NHOM_TS = "|T1|T2|T3|T4|T6|T7|T8|T10|T11|T12|T13|";
    }


    public interface IMPORT_COLUMN_M08 {
        String MATINH = "MATINH";
        String MA_CSKCB = "MA_CSKCB";
        String TEN_CSKCB = "TEN_CSKCB";
        String TONGMUCTT = "TONGMUCTT";
        String SOCHI_KQT = "SOCHI_KQT";
        String IS_VPT = "IS_VPT";
    }

    public interface IMPORT_COLUMN_NAME_M08 {
        String MATINH = "matinh";
        String MA_CSKCB = "ma_cskcb";
        String TEN_CSKCB = "ten_cskcb";
        String TONGMUCTT = "tongmuctt";
        String SOCHI_KQT = "sochi_kqt";
        String IS_VPT = "is_vpt";
    }

    public interface IMPORT_COLUMN_PL05 {
        String MACHITIEU = "MACHITIEU";
        String TENCHITIEU = "TENCHITIEU";
        String MASO = "MASO";
        String SONGUOI = "SONGUOI";
        String TONGSOTHU = "TONGSOTHU";
        String THUNAMTRC = "THUNAMTRC";
        String THUNAMNAY = "THUNAMNAY";
        String THUNAMSAU = "THUNAMSAU";
        String NSNNHOTRO = "NSNNHOTRO";
        String TONGSOTHUNAMNAY = "TONGSOTHUNAMNAY";
        String TONGSOTHUNAMSAU = "TONGSOTHUNAMSAU";
    }

    public interface IMPORT_COLUMN_NAME_PL05 {
        String MACHITIEU = "machitieu";
        String TENCHITIEU = "tenchitieu";
        String MASO = "maso";
        String SONGUOI = "songuoi";
        String TONGSOTHU = "tongsothu";
        String THUNAMTRC = "thunamtrc";
        String THUNAMNAY = "thunamnay";
        String THUNAMSAU = "thunamsau";
        String NSNNHOTRO = "nsnnhotro";
        String TONGSOTHUNAMNAY = "tongsothunamnay";
        String TONGSOTHUNAMSAU = "tongsothunamsau";
    }

    public interface IMPORT_COLUMN_OMDAU {
        String SO_HO_SO = "SOHOSO";
        String MA_DVI = "MA DON VI";
        String STT="SO THU TU";
        String MA_NHOM_HUONG = "MA NHOM HUONG";
        String SO_BHXH = "SO SO BHXH";
        String HO_TEN = "HO TEN";
        String SO_CMND = "SO CMND";
        String DK_LAM_VIEC = "DIEU KIEN LAM VIEC";
        String TUYEN_BENH_VIEN = "TUYEN BENH VIEN";
        String TU_NGAY_BS = "TU NGAY BAC SI";
        String DEN_NGAY_BS = "DEN NGAY BAC SI";
        String NGAY_SINH_CON = "NGAY SINH CUA CON";
        String SO_CON = "SO CON";
        String MA_BENH_DAI_NGAY = "MA BENH DAI NGAY";
        String SO_NGAY_DVI_DE_NGHI = "SO NGAY DON VI DE NGHI";
        String NGAY_NGHI_TUAN = "NGAY NGHI TUAN";
        String DOT_BO_SUNG = "DOT BO SUNG";
        String DUYET_SAI = "DUYET SAI";
        String HINH_THUC_NHAN = "HINH THUC NHAN";
        String SO_TK = "SO TAI KHOAN";
        String TEN_TK = "TEN CHU TAI KHOAN";
        String NGAN_HANG = "MA NGAN HANG";
        String TEN_NGAN_HANG = "TEN NGAN HANG";
        String MA_NV = "MA SO NHAN VIEN";
        String MA_TINH_NGAN_HANG = "MA TINH NGAN HANG";
    }

    public interface IMPORT_COLUMN_DSCHAMLINH_HT {
        String DL_C1 = "DL_C1";
        String QUANHUYEN="QUANHUYEN";
        String DL_C2 = "DL_C2";
        String XAPHUONG = "XAPHUONG";
        String DL_C3 = "DL_C3";
        String TODANPHO = "TODANPHO";
        String MANGUON = "MANGUON";
        String CHEDO = "CHEDO";
        String LOAI_CD = "LOAI_CD";
        String SOSO = "SOSO";
        String HOTEN = "HOTEN";
        String HOTENTUAT = "HOTENTUAT";
        String SOTHANG_CL = "SOTHANG_CL";
        String SOTIEN_CL = "SOTIEN_CL";
        String SOTIEN_DH = "SOTIEN_DH";
        String TS_DUOCLINH = "TS_DUOCLINH";
        String SO_ID = "SO_ID";
        String MA_DX = "MA_DX";
        String MA_SO_BHXH = "MA_SO_BHXH";
        String THUC_CHI = "THUC_CHI";
    }

    public interface IMPORT_COLUMN_THAISAN {
        String SO_HO_SO = "SOHOSO";
        String MA_DVI = "MA DON VI";
        String STT="SO THU TU";
        String MA_NHOM_HUONG = "MA NHOM HUONG";
        String SO_BHXH = "SO SO BHXH";
        String HO_TEN = "HO TEN";
        String SO_CMND = "SO CMND";
        String TU_NGAY_BS = "TU NGAY BAC SI";
        String DEN_NGAY_BS = "DEN NGAY BAC SI";
        String NGAY_SINH_CON = "NGAY SINH CUA CON";
        String SO_CON = "SO CON";
        String DK_KHAM_THAI="DIEU KIEN KHI KHAM THAI";
        String BIEN_PHAP_KHH="BIEN PHAP KHHGD";
        String TUOI_THAI="TUOI THAI (TUAN)";
        String DK_SINH_CON="DIEU KIEN SINH CON";
        String NGHI_DUONG_THAI="NGHI DUONG THAI";
        String CHA_NGHI_CHAM_CON="CHA NGHI CHAM CON";
        String NGAY_NHAN_NUOI="NGAY NHAN NUOI";
        String NGAY_DI_LAM_THUC_TE="NGAY DI LAM THUC TE";
        String NGAY_CON_CHET="NGAY CON CHET";
        String SO_BHXH_CMND_ME="SO SO BHXH/ SO CMND CUA ME";
        String PHAU_THUAT_THAI_DUOI_20T="PHAU THUAT/THAI DUOI 32 TUAN";
        String SO_NGAY_DVI_DE_NGHI = "SO NGAY DON VI DE NGHI";
        String NGAY_NGHI_TUAN = "NGAY NGHI TUAN";
        String DOT_BO_SUNG = "DOT BO SUNG";
        String DUYET_SAI = "DUYET SAI";
        String HINH_THUC_NHAN = "HINH THUC NHAN";
        String SO_TK = "SO TAI KHOAN";
        String TEN_TK = "TEN CHU TAI KHOAN";
        String NGAN_HANG = "MA NGAN HANG";
        String TEN_NGAN_HANG = "TEN NGAN HANG";
        String MA_NV = "MA SO NHAN VIEN";
        String MA_TINH_NGAN_HANG = "MA TINH NGAN HANG";
    }

    public interface IMPORT_COLUMN_DUONGSUC {
        String SO_HO_SO = "SOHOSO";
        String MA_DVI = "MA DON VI";
        String STT="SO THU TU";
        String MA_NHOM_HUONG = "MA NHOM HUONG";
        String SO_BHXH = "SO SO BHXH";
        String HO_TEN = "HO TEN";
        String SO_CMND = "SO CMND";
        String NGAY_GIAM_DINH="NGAY GIAM DINH";
        String TY_LE_SUY_GIAM="TY LE SUY GIAM";
        String SO_NGAY_DVI_DE_NGHI = "SO NGAY DON VI DE NGHI";
        String TU_NGAY_DVI_DE_NGHI = "TU NGAY DON VI DE NGHI";
        String DOT_BO_SUNG = "DOT BO SUNG";
        String DUYET_SAI = "DUYET SAI";
        String HINH_THUC_NHAN = "HINH THUC NHAN";
        String SO_TK = "SO TAI KHOAN";
        String TEN_TK = "TEN CHU TAI KHOAN";
        String NGAN_HANG = "MA NGAN HANG";
        String TEN_NGAN_HANG = "TEN NGAN HANG";
        String MA_NV = "MA SO NHAN VIEN";
        String MA_TINH_NGAN_HANG = "MA TINH NGAN HANG";
    }

    public interface IMPORT_COLUMN_NAME{
        String SO_HO_SO = "SOHOSO";
        String MA_DVI = "Mã đơn vị";
        String STT="Số thứ tự";
        String MA_NHOM_HUONG = "Mã nhóm hưởng";
        String SO_BHXH = "Số sổ BHXH";
        String HO_TEN = "Họ tên";
        String SO_CMND = "Số CMND";
        String DK_LAM_VIEC = "Điều kiện làm việc";
        String TUYEN_BENH_VIEN = "Tuyến bệnh viện";
        String TU_NGAY_BS = "Từ ngày bác sĩ";
        String DEN_NGAY_BS = "Đến ngày bác sĩ";
        String NGAY_SINH_CON = "Ngày sinh của con";
        String SO_CON = "Số con";
        String MA_BENH_DAI_NGAY = "Mã bệnh dài ngày";
        String SO_NGAY_DVI_DE_NGHI = "Số ngày đơn vị đề nghị";
        String NGAY_NGHI_TUAN = "Ngày nghỉ tuần";
        String DOT_BO_SUNG = "Đợt bổ sung";
        String DUYET_SAI = "Duyệt sai";
        String HINH_THUC_NHAN = "Hình thức nhận";
        String SO_TK = "Số tài khoản";
        String TEN_TK = "Tên chủ tài khoản";
        String NGAN_HANG = "Mã ngân hàng";
        String TEN_NGAN_HANG = "Tên ngân hàng";
        String MA_NV = "Mã số nhân viên";
        String DK_KHAM_THAI="Điều kiện khi khám thai";
        String BIEN_PHAP_KHH="Biện pháp KHHGĐ";
        String TUOI_THAI="Tuổi thai (tuần)";
        String DK_SINH_CON="Điều kiện sinh con";
        String NGHI_DUONG_THAI="Nghỉ dưỡng thai";
        String CHA_NGHI_CHAM_CON="Cha nghỉ chăm con";
        String NGAY_NHAN_NUOI="Ngày nhận nuôi";
        String NGAY_DI_LAM_THUC_TE="Ngày đi làm thực tế";
        String NGAY_CON_CHET="Ngày con chết";
        String SO_BHXH_CMND_ME="Số sổ BHXH/ Số CMND của mẹ";
        String PHAU_THUAT_THAI_DUOI_20T="Phẫu thuật/thai dưới 32 tuần";
        String NGAY_GIAM_DINH="Ngày giám đinh";
        String TY_LE_SUY_GIAM="Tỷ lệ suy giảm";
        String TU_NGAY_DVI_DE_NGHI = "Từ ngày đơn vị đề nghị";
        String MA_TINH_NGAN_HANG = "Mã tỉnh ngân hàng";
    }

    public interface IMPORT_COLUMN_NAME_DSCL_HT{
        String DL_C1 = "DL_C1";
        String QUANHUYEN="QUANHUYEN";
        String DL_C2 = "DL_C2";
        String XAPHUONG = "XAPHUONG";
        String DL_C3 = "DL_C3";
        String TODANPHO = "TODANPHO";
        String MANGUON = "MANGUON";
        String CHEDO = "CHEDO";
        String LOAI_CD = "LOAI_CD";
        String SOSO = "SOSO";
        String HOTEN = "HOTEN";
        String HOTENTUAT = "HOTENTUAT";
        String SOTHANG_CL = "SOTHANG_CL";
        String SOTIEN_CL = "SOTIEN_CL";
        String SOTIEN_DH = "SOTIEN_DH";
        String TS_DUOCLINH = "TS_DUOCLINH";
        String SO_ID = "SO_ID";
        String MA_DX = "MA_DX";
        String MA_SO_BHXH = "MA_SO_BHXH";
        String THUC_CHI = "THUC_CHI";
    }

    public interface MACHEDO {
        String CHEDO_OM = "OM";
        String CHEDO_TS = "TS";
        String CHEDO_DS = "DS";
    }

    public interface ODTS_CANHBAO {
        // dung trung cac che do
        String KHONG_CO_QUA_TRINH = "01";
        String NGAY_HUONG_SAY_NGAY_DUYET = "02";
        String NGHI_TRUNG_NGAY_NGHI = "03";
        String PHAT_SINH_CUOI_PATS = "04";
        String DOI_TUONG_CUOI_PA_PA = "05";
        String HET_SO_NGAY_CHE_DO = "06";
        String NGHI_TRUNG_NGAY_DA_HUONG_CD = "07";
        String SAI_GIOI_TINH = "08";
        String KHONG_DU_DIEU_KIEN_HUONG = "09";
        String LOI_KHAC = "42";
        String SO_NGAY_DON_VI_KHAC_SO_NGAY_BAO_HIEM = "78";
        String DOI_TUONG_DA_NGHI_VIEC_TAI_THANG = "79";
        String DOI_TUONG_DA_NGHI_TAI_THANG_HUONG = "80";
        String THANG_DE_NGHI_HUONG_DANG_HUONG_KHONG_LUONG = "81";
        String TRUNG_QT_DONG_BHXH="82";
        String TY_LE_THU_ODTS="84";
        // che do O1,O1
        String TUYEN_BENH_VIEN_KHONG_TON_TAI = "47";
        //chedo con om
        String TUOI_CON_LON_HON_7_TUOI = "10";
        String CON_CHUA_SINH = "11";
        //kham thai
        String HET_NGAY_CHE_DO = "12";
        String DA_GIAI_QUYET_CHE_DO_KHH = "13";

        //sinhcon
        String NGAY_HUONG_SAU_NGAY_SINH = "14";
        String NGAY_SINH_SAU_NGAY_DUYET = "15";
        String DA_HUONG_TS_TRONG_9_THANG = "16";
        String THAM_GIA_CHUA_DU_6_THANG = "17";
        String THAM_GIA_CHUA_DU_12_THANG = "18";
        String CHUA_DU_DK_NGHI_DUONG_THAI = "19";
        String CO_PHAT_SINH_TRUY_THU = "20";
        String SO_SO_KHONG_TON_TAI = "44";

        //chedo nuoi con
        String CON_LON_HON_6_THANG_TUOI = "21";
        String NGAY_NHAN_NUOI_CON_LON_HON_NGAY_SINH = "22";
        String NGAY_NGHI_VIEC_LON_HON_NGAY_DI_LAM = "23";

        // chedo Conchet
        String NGAY_CON_CHET_NHO_HON_NGAY_SINH = "24";

        //chedo me chet
        String NGAY_ME_CHET_NHO_HON_NGAY_SINH = "25";

        // che do mang thai ho
        String NGAY_GIAO_CON_NHO_HON_NGAY_SINH = "26";

        // chedo nho mang thai ho
        String NGAY_NHAN_CON_NHO_HON_NGAY_SINH = "27";

        // nam nghi vo sinh
        String NGAY_HUONG_TRUOC_NGAY_SINH_CON = "28";

        // che do duong suc
        String NGHI_OM_CHUA_DU_30_NGAY = "29";
        String HUONG_QUA_30_NGAY_TRO_LAI_LAMVIEC = "30";
        String DA_HUONG_CD_KHH_TRUOC_DO = "76";

        String NGAY_SINH_LON_HON_NGAY_GIA0_CON = "31";
        String NGAY_SINH_LON_HON_NGAY_HUONG = "32";
        String DA_HUONG_CHE_DO_KHONG_DC_HUONG_TIEP = "33";
        String THIEU_DU_LIEU_BAT_BUOC = "34";
        String KHAM_THAI_TAI_THANG_10 = "35";
        String DA_DI_KHAM_THAI_TREN_10_THANG = "36";
        String QUA_30_NGAY_KE_TU_NGAY_LAM_VIEC = "38";
        String TU_NGAY_KHONG_NHO_HON_NGAY_DI_KHAM = "39";
        String DA_PHAT_SINH_TU_DV_KHAC = "40";
        String LON_HON_NGAY_HIEN_TAI = "41";
        String DANH_MUC_KHONG_TON_TAI = "42";
        String SAI_MA_DON_VI = "50";
        String SAI_SO_HO_SO = "86";
        String KHONG_CO_TON_TAI_BO_SUNG = "51";

        String TU_NGAY_BS_LON_HON_DEN_NGAY_BS = "52";
        String SO_TIEN_HUONG_SAU_DC = "53";
        String TUOI_CON_LON_HON_7 = "54";
        String CON_SINH_LON_TU_NGAY_BS = "56";
        String NGAY_HUONG_SAU_NGAYDUYET = "57";
        String LOI_KHONG_LAY_DC_QT = "58";
        String LOI_KHONG_LAY_DC_TTG = "59";
        String KHONG_LAY_DUOC_QUA_TRINH = "60";
        String NGAY_DI_KHAM_KHONG_LON_HON_NGAY_HIENTAI = "61";
        String TU_NGAY_KHONG_LON_HON_NGAY_HT = "62";
        String NGAY_GIAM_DINH_KHONG_LON_HON_NGAY_HT = "63";
        String TU_NGAY_BS_KO_LON_HON_NGAY_HT = "64";
        String DEN_NGAY_BS_KO_LON_HON_TU_NGAYBS = "65";
        String NGAY_HUONG_KHONG_LON_HON_TU_NGAY_BS = "66";
        String TU_NGAY_BS_KHONG_LON_HON_NGAY_HT = "67";
        String DEN_NGAY_BS_KHONG_NHO_HON_TUNGAY_BS = "68";
        String NGAY_SINH_CON_KHONG_LON_HON_HT = "69";
        String NGAY_H_LON_HON_NGAY_SINH_CON = "70";
        String NGAY_SINH_CON_KO_LON_HON_NGAY_HT = "71";
        String NGAY_NGHI_LON_HON_NGAY_SINH_CON = "72";
        String NGAY_ME_CHET_KHONG_NHO_HONG_NGAY_SINHCON = "73";
        String NGAY_NGHI_KHONG_LON_HON_2_THANG_TRUOCSINH = "74";
        String NGAY_HUONG_KHONG_NHO_HON2THANG_TRUOC_TUNGAY_BS = "75";
        String MA_NHOM_HUONG_KO_TON_TAI = "77";
        String SAI_HO_TEN = "83";
        String DEN_NGAY_BS_KHONG_LON_HON_NGAY_HT = "85";
    }
    public interface THN_LOAIBD {
        String TH = "0";
        String TM = "1";
        String BD = "3";
        String TB = "4";
        String BS = "5";
        String LOAIBD = "TM,D1,D2,D3,N1,N2,N3,C1,C2,C3,C4,C5,C6,C7,C8,TL,TC,CI,TD,1L,TT,BT,NH,CN,D4,N4,CQ,CD,CH,IC,C9,C10";
    }


    public interface ODTS_REPLACE {
        String PA = "{pa}";
        String CHE_DO = "{chedo}";
        String TU_NGAY = "{tungay}";
        String DEN_NGAY = "{denngay}";
        String TU_THANG = "{tuthang}";
        String DEN_THANG = "{denthang}";
        String MA_DON_VI = "{maDonvi}";
        String MA_QT = "{maQt}";
    }

    public interface ODTS_HEADER {
        String LOI_TEN_TIEU_DE_TRONG_BANG = "Sai tên tiêu đề cột trong bảng dữ liệu, hãy tải lại import mẫu và làm lại dữ liệu.";
    }

    public static final String SQL_INSERT_CHAM_LINH_HT = "insert into bhc_tg_cl_temp a(" +
        "    a.ma_dvi," +
        "    a.LOI_NV," +
        "    a.lan_dc," +
        "    a.thang," +
        "    a.so_thang_cl," +
        "    a.so_chl," +
        "    a.so_tien," +
        "    a.dxcb," +
        "    a.tien_dxcb," +
        "    a.dxnd," +
        "    a.tien_dxnd," +
        "    a.ly_do," +
        "    a.ho_va_ten," +
        "    a.so_so_bhxh," +
        "    a.loai_hs," +
        "    a.luong," +
        "    a.tien_khac," +
        "    a.da_tt," +
        "    a.nsd," +
        "    a.ngay_nh," +
        "    a.idvung," +
        "    a.id_hs," +
        "    a.status," +
        "    a.ma_dx," +
        "    a.cl_dl," +
        "    a.cl_2thang," +
        "    a.so_tien_tl," +
        "    a.ma_tinh," +
        "    a.import_status," +
        "    a.MA_LOI," +
        "    a.IS_LOI," +
        "    a.LOI_DL," +
        "    a.MA_SO_BHXH," +
        "    a.THUC_CHI," +
        "    a.TONG_TIEN," +
        "    a.TEN_DC," +
        "    a.LOAI_DC," +
        "    a.THANG_DC," +
        "    a.LOAI_CD_IM," +
        "    a.so_id," +
        "    a.is_hh," +
        "    a.is_bd," +
        "    a.id" +
        "    )values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?||FHT_ID_MOI(), 0, ?,BHC_TG_CL_TEMP_SEQ.nextval)"; // chung ID vs bang hh

    public static final String SQL_INSERT_CHAM_LINH_HH_HT = "insert into bhc_tg_cl_temp a(" +
        "    a.ma_dvi," +
        "    a.LOI_NV," +
        "    a.lan_dc," +
        "    a.thang," +
        "    a.so_thang_cl," +
        "    a.so_chl," +
        "    a.so_tien," +
        "    a.dxcb," +
        "    a.tien_dxcb," +
        "    a.dxnd," +
        "    a.tien_dxnd," +
        "    a.ly_do," +
        "    a.ho_va_ten," +
        "    a.so_so_bhxh," +
        "    a.loai_hs," +
        "    a.luong," +
        "    a.tien_khac," +
        "    a.da_tt," +
        "    a.nsd," +
        "    a.ngay_nh," +
        "    a.idvung," +
        "    a.id_hs," +
        "    a.status," +
        "    a.ma_dx," +
        "    a.cl_dl," +
        "    a.cl_2thang," +
        "    a.so_tien_tl," +
        "    a.ma_tinh," +
        "    a.import_status," +
        "    a.MA_LOI," +
        "    a.IS_LOI," +
        "    a.LOI_DL," +
        "    a.MA_SO_BHXH," +
        "    a.THUC_CHI," +
        "    a.TONG_TIEN," +
        "    a.TEN_DC," +
        "    a.LOAI_DC," +
        "    a.THANG_DC," +
        "    a.LOAI_CD_IM," +
        "    a.so_id," +
        "    a.is_hh," +
        "    a.IS_BD," +
        "    a.id" +
        "    )values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?||FHT_ID_MOI(), 1, ?,BHC_TG_CL_TEMP_SEQ.nextval)";

    public static final String SQL_INSERT_BHC_C72_HT_QD166 = "insert into BHC_C72_HT_QD166(" +
        "    ID," +
        "    DLY_CAP1," +
        "    QUAN_HUYEN," +
        "    DLY_CAP2," +
        "    XA_PHUONG," +
        "    DLY_CAP3," +
        "    TO_DAN_PHO," +
        "    NGUON_KINH_PHI," +
        "    CHE_DO," +
        "    LOAI_CHEDO," +
        "    SO_BHXH," +
        "    HO_TEN," +
        "    SO_THANGCL," +
        "    SO_TIENCL," +
        "    TS_DUOC_LINH," +
        "    KY_NHAN," +
        "    SH," +
        "    SO_TIENH," +
        "    NHOM_CD," +
        "    MA_NGUON," +
        "    MA_NH," +
        "    DAI_DIEN," +
        "    TEN_TUAT," +
        "    NHOM_NH," +
        "    MA_NGUON_GRP," +
        "    MA_QUY," +
        "    MA_CDBC," +
        "    TEN_CDBC," +
        "    SO_TIEN1L," +
        "    SO_TIENKT," +
        "    MA_CDBC_C1," +
        "    TEN_CDBC_C1," +
        "    MA_TINH," +
        "    LAN_CHUYEN," +
        "    IS_LOI," +
        "    THANG_DC," +
        "    ATM," +
        "    PATH_FILE," +
        "    NGUOI_CHUYEN," +
        "    NGAY_CHUYEN," +
        "    SO_ID," +
        "    MA_DS," +
        "    NGAY_NHAP," +
        "    MA_CQBH," +
        "    LOAI_BH," +
        "    LOAI_HUONG," +
        "    NGAY_SINH," +
        "    GIOI_TINH," +
        "    SO_DT," +
        "    SO_GTO," +
        "    LOAI_GTO," +
        "    NGAY_CAP," +
        "    NOI_CAP," +
        "    DC_TINH," +
        "    DC_HUYEN," +
        "    DC_XA," +
        "    DIA_CHI," +
        "    ANH," +
        "    MAU_BC," +
        "    TU_NGAY_BS," +
        "    DEN_NGAY_BS," +
        "    ID_REF," +
        "    STK," +
        "    TEN_CTK," +
        "    MA_DVQL," +
        "    TC_LD_TN," +
        "    TC_LD_30," +
        "    TC_83," +
        "    TC_MTP," +
        "    TC_KV," +
        "    TIEN_GD," +
        "    TC_NSNN," +
        "    MA_SO_BHXH," +
        "    TIEN_CL," +
        "    LAN_DC," +
        "    LOAI_DC," +
        "    PC_NPV," +
        "    PC_NPV_TRC," +
        "    THANG_DC_GOC," +
        "    NGAY_TRC," +
        "    TIEN_CL_1L," +
        "    TG_HUONG_TUAT," +
        "    DOT_CKT" +
        "    )values("  +
        "        BHC_C72_HT_QD166_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_BHC_CKT_C72_HT_QD166 = "INSERT INTO bhc_ckt_qd166(" +
        "    ID," +
        "    TEN_BAOCAO," +
        "    MA_TINH," +
        "    MA_DAILY," +
        "    THANG_CHI," +
        "    ATM," +
        "    PATH_FILE," +
        "    TEN_FILE," +
        "    NGUOI_CHUYEN," +
        "    NGAY_CHUYEN," +
        "    NGUOI_TCKT," +
        "    NGAY_TCKT," +
        "    TT_CDCS," +
        "    TT_TCKT," +
        "    TT_BD," +
        "    LAN_CHUYEN," +
        "    IS_LOI," +
        "    FORMAT," +
        "    LABEL," +
        "    LOI_INSERT," +
        "    TU_NGAY_BS," +
        "    DEN_NGAY_BS," +
        "    PATH_FILE_TTC," +
        "    TEN_FILE_TTC," +
        "    ID_XML," +
        "    MA_CQBH_DUYET," +
        "    ID_REF" +
        ")VALUES(" +
        "    bhc_ckt_qd166_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_BHC_CKT_C72_HT_QD166_ID = "INSERT INTO bhc_ckt_qd166(" +
        "    TEN_BAOCAO," +
        "    MA_TINH," +
        "    MA_DAILY," +
        "    THANG_CHI," +
        "    ATM," +
        "    PATH_FILE," +
        "    TEN_FILE," +
        "    NGUOI_CHUYEN," +
        "    NGAY_CHUYEN," +
        "    NGUOI_TCKT," +
        "    NGAY_TCKT," +
        "    TT_CDCS," +
        "    TT_TCKT," +
        "    TT_BD," +
        "    LAN_CHUYEN," +
        "    IS_LOI," +
        "    FORMAT," +
        "    LABEL," +
        "    LOI_INSERT," +
        "    TU_NGAY_BS," +
        "    DEN_NGAY_BS," +
        "    PATH_FILE_TTC," +
        "    TEN_FILE_TTC," +
        "    ID_XML," +
        "    MA_CQBH_DUYET," +
        "    ID_REF," +
        "    ID," +
        "    DOT_CKT" +
        "    ,LABEL_NL" +
        "    ,LABEL_TP" +
        "    ,LABEL_GD" +
        "    ,CHU_KY" +
        "    ,CHU_KY_CD" +
        "    ,CHU_KY_USER" +
        "    ,NHAN_LD_01" +
        "    ,NHAN_LD_02" +
        "    ,NHAN_LD_03" +
        "    ,NHAN_CD_01" +
        "    ,NHAN_CD_02" +
        "    ,TONG_NGUOI" +
        "    ,TONG_TIEN" +
        ")VALUES(" +
        "    ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_BHC_CKT_C97_HT_QD166 = "INSERT INTO bhc_ckt_qd166(" +
        "    TEN_BAOCAO," +
        "    MA_TINH," +
        "    MA_DAILY," +
        "    THANG_CHI," +
        "    ATM," +
        "    PATH_FILE," +
        "    TEN_FILE," +
        "    NGUOI_CHUYEN," +
        "    NGAY_CHUYEN," +
        "    NGUOI_TCKT," +
        "    NGAY_TCKT," +
        "    TT_CDCS," +
        "    TT_TCKT," +
        "    TT_BD," +
        "    LAN_CHUYEN," +
        "    IS_LOI," +
        "    FORMAT," +
        "    LABEL," +
        "    LOI_INSERT," +
        "    TU_NGAY_BS," +
        "    DEN_NGAY_BS," +
        "    PATH_FILE_TTC," +
        "    TEN_FILE_TTC," +
        "    ID_XML," +
        "    MA_CQBH_DUYET," +
        "    DOT_CKT," +
        "    THANG_THUC_CHI," +
        "    ID" +
        "    ,MA_CQBH_CT" +
        "    ,TONG_NGUOI" +
        "    ,TONG_TIEN" +
        "    ,LABEL_NL" +
        "    ,LABEL_TP" +
        "    ,LABEL_GD" +
        "    ,CHU_KY" +
        "    ,CHU_KY_CD" +
        "    ,CHU_KY_USER" +
        "    ,NHAN_LD_01" +
        "    ,NHAN_LD_02" +
        "    ,NHAN_LD_03" +
        "    ,NHAN_CD_01" +
        "    ,NHAN_CD_02" +
        ")VALUES(" +
        "    ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ")";

    public static final String UPDATE_IS_IMPORT_VNPOST7CBH = "UPDATE vnpost_bhc_7cbh set IS_IMPORT = ? where DL_C1 = ? and (KY_CHI_TRA = ?||'00' or KY_CHI_TRA = ?) and IS_IMPORT = 0";

    public static final String UPDATE_IDXML_C97_XD_QD166 = "UPDATE xd_c97_qd166 set id_xml = ?, tt_cdcs = ?, tt_tckt = ?, tt_bd = ? where id_ref= ?";

    public static final String DELETE_IDXML_C72A_QD166 = "DELETE FROM BHC_C72_HT_QD166 where id_ref = ?";

    public static final String DELETE_IDXML_MS10_QD166 = "DELETE FROM bhc_ms10_ht_qd166 where id_ref = ?";

    public static final String INSERT_BHC_CKT_C72_HT_QD166_C72b = "INSERT INTO bhc_ckt_qd166(" +
        "    TEN_BAOCAO," +
        "    MA_TINH," +
        "    MA_DAILY," +
        "    THANG_CHI," +
        "    ATM," +
        "    PATH_FILE," +
        "    TEN_FILE," +
        "    NGUOI_CHUYEN," +
        "    NGAY_CHUYEN," +
        "    NGUOI_TCKT," +
        "    NGAY_TCKT," +
        "    TT_CDCS," +
        "    TT_TCKT," +
        "    TT_BD," +
        "    IS_LOI," +
        "    FORMAT," +
        "    LABEL," +
        "    LOAI_IN," +
        "    LOI_INSERT," +
        "    THANG_THUC_CHI," +
        "    ID_XML," +
        "    PATH_FILE_TTC," +
        "    TEN_FILE_TTC, " +
        "    LAN_TAO," +
        "    NGAY_IN," +
        "    TONG_NGUOI," +
        "    TONG_TIEN," +
        "    ID" +
        ")VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,bhc_ckt_qd166_seq.nextval)";

    public static final String INSERT_BHC_CKT_C72_HT_QD166_C72b_CKT = "INSERT INTO bhc_ckt_qd166(" +
        "    TEN_BAOCAO," +
        "    MA_TINH," +
        "    MA_DAILY," +
        "    THANG_CHI," +
        "    ATM," +
        "    PATH_FILE," +
        "    TEN_FILE," +
        "    NGUOI_CHUYEN," +
        "    NGAY_CHUYEN," +
        "    NGUOI_TCKT," +
        "    NGAY_TCKT," +
        "    TT_CDCS," +
        "    TT_TCKT," +
        "    TT_BD," +
        "    IS_LOI," +
        "    FORMAT," +
        "    LABEL," +
        "    LOAI_IN," +
        "    LOI_INSERT," +
        "    THANG_THUC_CHI," +
        "    ID_XML," +
        "    PATH_FILE_TTC," +
        "    TEN_FILE_TTC, " +
        "    LAN_TAO," +
        "    ID" +
        ")VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,bhc_ckt_qd166_seq.nextval)";

    public static final String INSERT_BHC_CKT_C72_HT_QD166_MS12_CKT = "INSERT INTO bhc_ckt_qd166(" +
        "    TEN_BAOCAO," +
        "    MA_TINH," +
        "    MA_DAILY," +
        "    THANG_CHI," +
        "    ATM," +
        "    PATH_FILE," +
        "    TEN_FILE," +
        "    NGUOI_CHUYEN," +
        "    NGAY_CHUYEN," +
        "    NGUOI_TCKT," +
        "    NGAY_TCKT," +
        "    TT_CDCS," +
        "    TT_TCKT," +
        "    TT_BD," +
        "    IS_LOI," +
        "    FORMAT," +
        "    LABEL," +
        "    LOI_INSERT," +
        "    THANG_THUC_CHI," +
        "    ID_XML," +
        "    PATH_FILE_TTC," +
        "    TEN_FILE_TTC, " +
        "    LAN_TAO," +
        "    ID" +
        ")VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,bhc_ckt_qd166_seq.nextval)";


    public static final String INSERT_BHC_CKT_C72_HT_QD166_Ms12 = "INSERT INTO bhc_ckt_qd166(" +
        "    TEN_BAOCAO," +
        "    MA_TINH," +
        "    MA_DAILY," +
        "    THANG_CHI," +
        "    ATM," +
        "    PATH_FILE," +
        "    TEN_FILE," +
        "    NGUOI_CHUYEN," +
        "    NGAY_CHUYEN," +
        "    NGUOI_TCKT," +
        "    NGAY_TCKT," +
        "    TT_CDCS," +
        "    TT_TCKT," +
        "    TT_BD," +
        "    IS_LOI," +
        "    FORMAT," +
        "    LABEL," +
        "    LOI_INSERT," +
        "    ID_XML," +
        "    LAN_TAO," +
        "    NGAY_IN,"+
        "    ID" +
        ")VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,bhc_ckt_qd166_seq.nextval)";

    public static final String UPDATE_BHC_CKT_C72_HT_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " TT_CDCS=?, " +
        " TT_TCKT=? "+
        " where (id=? or id_xml=?) and ten_baocao =?";

    public static final String UPDATE_BHC_CKT_C72_HT_QD166_KT = "update bhc_ckt_qd166 "+
        " set "+
        " TT_CDCS=?, " +
        " TT_TCKT=?, "+
        " NGAY_CHUYEN=SYSDATE "+
        " where (id=? or id_xml=?) and ten_baocao =? and LABEL = 'KT' ";


    public static final String UPDATE_XD_TT_CKT_C97_QD166 = "update xd_c97_qd166 "+
        " set "+
        " TRANG_THAI=?, " +
        " TT_CDCS=?, " +
        " TT_TCKT=? "+
        " where id_xml=?";

    public static final String UPDATE_XDHOSO_TT_CKT_C97_QD166 = "update xd_ho_so "+
        " set "+
        " TRANG_THAI_CKT=? " +
        " where id in (select id_hs from xd_c97_qd166 where id_xml = ?)";

    public static final String UPDATE_BHC_CKT_C72b_HT_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " TT_CDCS=?, " +
        " TT_TCKT=?, "+
        " DOT_CKT=?, "+
        " LAN_CHUYEN=?, "+
        " NGUOI_CHUYEN=?, NGAY_CHUYEN = CURRENT_TIMESTAMP "+
        " where TEN_BAOCAO =? and MA_TINH =? and MA_DAILY=? and THANG_CHI =? AND ATM =? AND LAN_TAO=? AND THANG_THUC_CHI = ?";

    public static final String UPDATE_BHC_CKT_MS12_HT_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " TT_CDCS=?, " +
        " TT_TCKT=?, "+
        " DOT_CKT=?, "+
        " LAN_CHUYEN=?, "+
        " NGUOI_CHUYEN=?, NGAY_CHUYEN = CURRENT_TIMESTAMP "+
        " where TEN_BAOCAO =? and MA_TINH =? and MA_DAILY=? and THANG_CHI =? AND ATM =? AND LAN_TAO=? ";

    public static final String UPDATE_XD_HO_SO_QDDC_TP_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " TP_KY=?, " +
        " TEN_TP=? ," +
        " NGAY_TP_KY=? ," +
        " PATH_FILE_TP=? ," +
        " TRANG_THAI_PD=? " +
        " where id=?  and ten_bc = 'QD_DC' ";

    public static final String UPDATE_XD_HO_SO_QDDC_NL_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " NL_KY=? " +
        " where id=?  and ten_bc = 'QD_DC' ";

    public static final String UPDATE_XD_HO_SO_QDDC_GD_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " GD_KY=? ," +
        " TEN_GD=? ," +
        " NGAY_GD_KY=? ," +
        " PATH_FILE_GD=? ," +
        " TT_PHEDUYET_GD=? " +
        " where id=? and ten_bc = 'QD_DC' ";

    public static final String UPDATE_XD_HO_SO_QDDC_VT_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " VT_KY=? ," +
        " TEN_VT=? ," +
        " NGAY_VT_KY=? ," +
        " PATH_FILE_VT=? ," +
        " TT_PHEDUYET_VT=? " +
        " where id=? and ten_bc = 'QD_DC' ";

    public static final String UPDATE_XD_HO_SO_TP_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " TP_KY=?, " +
        " TEN_TP=? ," +
        " NGAY_TP_KY=? ," +
        " PATH_FILE_TP=? ," +
        " TRANG_THAI_PD=? " +
        " where id=?  and ten_bc = 'QD_QT' ";

    public static final String UPDATE_XD_HO_SO_NL_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " NL_KY=? " +
        " where id=?  and ten_bc = 'QD_QT' ";

    public static final String UPDATE_XD_HO_SO_GD_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " GD_KY=? ," +
        " TEN_GD=? ," +
        " NGAY_GD_KY=? ," +
        " PATH_FILE_GD=? ," +
        " TT_PHEDUYET_GD=? " +
        " where id=? and ten_bc = 'QD_QT' ";

    public static final String UPDATE_XD_HO_SO_VT_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " VT_KY=? ," +
        " TEN_VT=? ," +
        " NGAY_VT_KY=? ," +
        " PATH_FILE_VT=? ," +
        " TT_PHEDUYET_VT=? " +
        " where id=? and ten_bc = 'QD_QT' ";

    //18hsb
    public static final String UPDATE_XD_1823_HSB_TP_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " TP_KY=?, " +
        " TEN_TP=? ," +
        " NGAY_TP_KY=? ," +
        " PATH_FILE_TP=? ," +
        " TRANG_THAI_PD=? " +
        " where id=?  and ten_bc = ? ";

    public static final String UPDATE_XD_1823_HSB_NL_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " NL_KY=? " +
        " where id=?  and ten_bc = ? ";

    public static final String UPDATE_XD_1823_HSB_GD_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " GD_KY=? ," +
        " TEN_GD=? ," +
        " NGAY_GD_KY=? ," +
        " PATH_FILE_GD=? ," +
        " TT_PHEDUYET_GD=? " +
        " where id=? and ten_bc = ? ";

    public static final String UPDATE_XD_1823_HSB_VT_KY_QD166 = "update xd_ho_so_qd166 "+
        " set "+
        " VT_KY=? ," +
        " TEN_VT=? ," +
        " NGAY_VT_KY=? ," +
        " PATH_FILE_VT=? ," +
        " TT_PHEDUYET_VT=? " +
        " where id=? and ten_bc = ? ";
    //18hsb

    public static final String UPDATE_19HSB_TP_KY_QD166 = "update XD_HO_SO_QD166 "+
        " set "+
        " TP_KY=?, " +
        " TEN_TP=?, " +
        " NGAY_TP_KY=?, " +
        " TRANG_THAI_PD=1, " +
        " PATH_FILE_TP=? " +
        " where id=?";

    public static final String UPDATE_19HSB_GD_KY_QD166 = "update XD_HO_SO_QD166 "+
        " set "+
        " GD_KY=?, " +
        " TEN_GD=?, " +
        " NGAY_GD_KY=?, " +
        " TT_PHEDUYET_GD=1, " +
        " PATH_FILE_GD=? " +
        " where id=?";

    public static final String UPDATE_19HSB_VT_KY_QD166 = "update XD_HO_SO_QD166 "+
        " set "+
        " VT_KY=?, " +
        " TEN_VT=?, " +
        " NGAY_VT_KY=?, " +
        " TT_PHEDUYET_VT=1, " +
        " PATH_FILE_VT=? " +
        " where id=?";

    public static final String UPDATE_19HSB_NL_KY_QD166 = "update XD_HO_SO_QD166 "+
        " set "+
        " NL_KY=? " +
        " where id=?";

    public static final String UPDATE_C90_TP_KY_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " IS_PCKY=?, " +
        " TEN_PC=?, " +
        " NGAY_PC_KY=?, " +
        " TT_PD_PC=1, " +
        " PATH_FILE_PC=?, " +
        " NGAY_PC_PD=SYSTIMESTAMP " +
        " where id=?";

    public static final String UPDATE_C90_GD_KY_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " IS_GDKY=?, " +
        " TEN_GD=?, " +
        " NGAY_GD_KY=?, " +
        " TT_PD_GD=1, " +
        " PATH_FILE_GD=?, " +
        " NGAY_GD_PD=SYSTIMESTAMP " +
        " where id=?";

    public static final String UPDATE_C90_VT_KY_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " IS_VTKY=?, " +
        " TEN_VT=?, " +
        " NGAY_VT_KY=SYSTIMESTAMP, " +
        " TT_PD_VT=1, " +
        " PATH_FILE_VT=? " +
        " where id=?";

    public static final String UPDATE_C90_NL_KY_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " IS_NLKY=? " +
        " where id=?";

    public static final String UPDATE_C97_TP_KY_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " IS_PCKY=?, " +
        " TEN_PC=?, " +
        " NGAY_PC_KY=?, " +
        " TT_PD_PC=1, " +
        " PATH_FILE_PC=?, " +
        " NGAY_PC_PD=SYSTIMESTAMP " +
        " where id=?";

    public static final String UPDATE_C97_GD_KY_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " IS_GDKY=?, " +
        " TEN_GD=?, " +
        " NGAY_GD_KY=?, " +
        " TT_PD_GD=1, " +
        " PATH_FILE_GD=?, " +
        " NGAY_GD_PD=SYSTIMESTAMP " +
        " where id=?";

    public static final String UPDATE_C97_NL_KY_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " IS_NLKY=? " +
        " where id=?";

    public static final String UPDATE_THN_NL_KY_C87B = "update BHC_CKT_87_THN "+
        " set "+
        " IS_NLKY=? " +
        " where ID=?";

    public static final String UPDATE_THN_TP_KY_C87B = "update BHC_CKT_87_THN "+
        " set "+
        " IS_PCKY=?, " +
        " TT_PD_PC=?, " +
        " TEN_PC=?, " +
        " NGAY_PC_KY=?, " +
        " PATH_FILE_PC=? " +
        " where ID=?";

    public static final String UPDATE_THN_GD_KY_C87B = "update BHC_CKT_87_THN "+
        " set "+
        " IS_GDKY=?, " +
        " TT_PD_GD=?, " +
        " TEN_GD=?, " +
        " NGAY_GD_KY=?, " +
        " PATH_FILE_GD=? " +
        " where ID=?";

    public static final String UPDATE_THN_VT_KY_C87B = "update BHC_CKT_87_THN "+
        " set "+
        " IS_VTKY=?, " +
        " TT_PD_VT=?, " +
        " TEN_VT=?, " +
        " NGAY_VT_KY=?, " +
        " PATH_FILE_VT=? " +
        " where ID=?";

    public static final String UPDATE_THN_NL_KY_C93 = "update BHC_CKT_93_THN "+
        " set "+
        " IS_NLKY=? " +
        " where ID=?";

    public static final String UPDATE_THN_TP_KY_C93 = "update BHC_CKT_93_THN "+
        " set "+
        " IS_PCKY=?, " +
        " TT_PD_PC=?, " +
        " TEN_PC=?, " +
        " NGAY_PC_KY=?, " +
        " PATH_FILE_PC=? " +
        " where ID=?";

    public static final String UPDATE_THN_GD_KY_C93 = "update BHC_CKT_93_THN "+
        " set "+
        " IS_GDKY=?, " +
        " TT_PD_GD=?, " +
        " TEN_GD=?, " +
        " NGAY_GD_KY=?, " +
        " PATH_FILE_GD=? " +
        " where ID=?";

    public static final String UPDATE_ODTS_NL_KY_QD166 = "update odts_dotqt_qd166 "+
        " set "+
        " NL_KY=? " +
        " where ID=?";

    public static final String UPDATE_ODTS_TP_KY_QD166 = "update odts_dotqt_qd166 "+
        " set "+
        " TP_KY=? ," +
        " TEN_TP=? ," +
        " NGAY_TP_KY=? ," +
        " PATH_FILE_TP=? ," +
        " TT_PHEDUYET=1" +
        " where ID=?";

    public static final String UPDATE_ODTS_GD_KY_QD166 = "update odts_dotqt_qd166 "+
        " set "+
        " GD_KY=? ," +
        " TEN_GD=? ," +
        " NGAY_GD_KY=? ," +
        " PATH_FILE_GD=? ," +
        " TT_PHEDUYET_GD=1" +
        " where ID=?";

    public static final String UPDATE_ODTS_VT_KY_QD166 = "update odts_dotqt_qd166 "+
        " set "+
        " VT_KY=? ," +
        " TEN_VT=? ," +
        " NGAY_VT_KY=? ," +
        " PATH_FILE_VT=? ," +
        " TT_PHEDUYET_VT=1" +
        " where ID=?";

    public static final String UPDATE_XML_NL_KY_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " IS_NLKY=? " +
        " where ID=?";

    public static final String UPDATE_XML_TP_KY_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " IS_PCKY=? ," +
        " TT_PD_PC=? ," +
        " TEN_PC=? ," +
        " NGAY_PC_KY=? ," +
        " PATH_FILE_PC=? " +
        " where ID=?";

    public static final String UPDATE_XML_GD_KY_QD166 = "update bhc_ckt_qd166 "+
        " set "+
        " IS_GDKY=? ," +
        " TT_PD_GD=? ," +
        " TEN_GD=? ," +
        " NGAY_GD_KY=? ," +
        " PATH_FILE_GD=? " +
        " where ID=?";

    public static final String INSERT_XD_HO_SO_QD166 = "INSERT INTO XD_HO_SO_QD166("+
        "    ID_XD_HO_SO,"+
        "    HS_ID,"+
        "    DC_LAN,"+
        "    MA_DS,"+
        "    SO_SO,"+
        "    CMND,"+
        "    HO_TEN,"+
        "    MA_HUONG,"+
        "    TEN_CD,"+
        "    SO_QD,"+
        "    NGAY_QD,"+
        "    TEN_DVI_CT,"+
        "    TRANG_THAI_HS,"+
        "    NGUOI_TRINH_KY,"+
        "    NGAY_TRINH_KY,"+
        "    MA_CQ_BHXH,"+
        "    MA_TINH,"+
        "    PATH_FILE,"+
        "    TEN_FILE,"+
        "    IS_LOI,"+
        "    NGUOI_PHE_DUYET,"+
        "    NGAY_PHE_DUYET,"+
        "    TRANG_THAI_PD,"+
        "    id,"+
        "    TEN_BC,"+
        "    LAN_TAO," +
        "    COUNT_SIGN," +
        "    KY_HIEU_SO," +
        "    SO_HS_TNHS" +
        ")VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String DELETE_XD_HO_SO_QD166 = "delete from xd_ho_so_qd166 where id=?";

    public static final String DELETE_ODTS_DOTQT_QD166 = "delete from odts_dotqt_qd166 where id=?";

    public static final String DELETE_C90_CKT_QD166 = "delete from bhc_ckt_qd166 where (id=? or id_xml = ?) and ten_baocao=? and nvl(tt_cdcs, 1)=1";

    public static final String DELETE_C97_CKT_QD166 = "delete from bhc_ckt_qd166 where (id=? or id_xml = ?) and ten_baocao=? and nvl(tt_cdcs, 1)=1";

    public static final String DELETE_C72A_CKT_QD166 = "delete from bhc_ckt_qd166 where (id=? or id_xml = ?) and ten_baocao=? and nvl(tt_cdcs, 1)=1";

    public static final String DELETE_MS10_CKT_QD166 = "delete from bhc_ckt_qd166 where (id=? or id_xml = ?) and ten_baocao=? and nvl(tt_cdcs, 1)=1";

    public static final String DELETE_XD_C90_QD166 = "delete from xd_ckt_c90_qd166 where id_xml=?";

    public static final String DELETE_XD_C90_TH_QD166 = "delete from xd_ckt_c90_th_qd166 where id_xml=?";

    public static final String DELETE_XD_C97_QD166 = "delete from xd_c97_qd166 where id_xml=? and nvl(tt_tckt, 1)=1";

    public static final String UPDATE_TTCKT_DELETE_C97_CKT_QD166 = "update xd_ho_so set trang_thai_ckt = 0 where id in (select id_hs from xd_c97_qd166 where id_xml=? and nvl(tt_tckt, 1) = 1)";

    public static final String UPDATE_TTCKT_DELETE_C90_CKT_QD166 = "update xd_ho_so set trang_thai_ckt = 0 where id in (select ID_XD_HS from XD_CKT_C90_QD166 where id_xml=?)";

    public static final String DELETE_BHC_C72A_QD166 = "delete from bhc_c72_ht_qd166 where id_xml=?";

    public static final String DELETE_BHC_MS10_QD166 = "delete from bhc_ms10_ht_qd166 where id_xml=?";

    public static final String DELETE_XD_QDQT_QD166 = "delete from xd_ho_so_qd166 where id=? and ten_bc = ?";

    public static final String DELETE_XD_18HSB_QD166 = "delete from xd_ho_so_qd166 where id=? and ten_bc = ?";

    public static final String DELETE_XD_23HSB_QD166 = "delete from xd_ho_so_qd166 where id=? and ten_bc = ?";

    public static final String DELETE_XD_QDDC_QD166 = "delete from xd_ho_so_qd166 where id=? and ten_bc = ?";

    public static final String DELETE_XD_19HSB_QD166 = "delete from xd_ho_so_qd166 where id=? and ten_bc = ?";

    public static final String DELETE_XD_21HSB_QD166 = "delete from xd_ho_so_qd166 where id=? and ten_bc = ?";

    public static final String UPDATE_XD_21HSB_QD166 = "UPDATE  XD_DE_NGHI_THU_21HSB SET TT_TAODL = NULL where ID_REF =?";

    public static final String UPDATE_CKT_C90_CKT_QD166 = "update bhc_ckt_qd166 set TT_CDCS = ? where (id=? or id_xml =?) and ten_baocao=?";

    public static final String UPDATE_CKT_XD_C90_QD166 = "update xd_ckt_c90_qd166 set trang_thai = ? where id_xml=?";

    public static final String UPDATE_CKT_XD_C90_TH_QD166 = "update xd_ckt_c90_th_qd166 set trang_thai = ? where id_xml=?";

    public static final String UPDATE_TRINHKY_XD_C90_QD166 = "update bhc_ckt_qd166 set tt_tk = ? where id in (?) and nvl(tt_pd_pc, 0) <> 1";

    public static final String UPDATE_TRINHKY_XD_C97_QD166 = "update bhc_ckt_qd166 set tt_tk = ? where id in (?) and nvl(tt_pd_pc, 0) <> 1";

    public static final String UPDATE_TRINHKY_BHC_C72A_QD166 = "update bhc_ckt_qd166 set tt_tk = ? where id in (?) and nvl(tt_pd_pc, 0) <> 1 ";

    public static final String UPDATE_TRINHKY_BHC_MS10_QD166 = "update bhc_ckt_qd166 set tt_tk = ? where id in (?) and nvl(tt_pd_pc, 0) <> 1 ";

    public static final String UPDATE_TRINHKY_XD_QDQT_QD166 = "update xd_ho_so_qd166 set tt_tk = ? where id in (?) and ten_bc = ? and nvl(TRANG_THAI_PD, 0) <> 1";

    public static final String UPDATE_TRINHKY_XD_18HSB_QD166 = "update xd_ho_so_qd166 set tt_tk = ? where id in (?) and ten_bc = ? and nvl(TRANG_THAI_PD, 0) <> 1";

    public static final String UPDATE_TRINHKY_XD_23HSB_QD166 = "update xd_ho_so_qd166 set tt_tk = ? where id in (?) and ten_bc = ? and nvl(TRANG_THAI_PD, 0) <> 1";

    public static final String UPDATE_TRINHKY_XD_QDDC_QD166 = "update xd_ho_so_qd166 set tt_tk = ? where id in (?) and ten_bc = ? and nvl(TRANG_THAI_PD, 0) <> 1";

    public static final String UPDATE_TRINHKY_XD_19HSB_QD166 = "update xd_ho_so_qd166 set TT_TK = ? where id in (?) and ten_bc = ? and nvl(TRANG_THAI_PD, 0) <> 1";

    public static final String UPDATE_TRINHKY_XD_21HSB_QD166 = "update xd_ho_so_qd166 set TT_TK = ? where id in (?) and ten_bc = ? and nvl(TRANG_THAI_PD, 0) <> 1";

    public static final String UPDATE_CKT_XD_19HSB_QD166 = "update xd_ho_so_qd166 set TT_CKT = ? where id in (?) and ten_bc = ?";

    public static final String UPDATE_TRINHKY_THN_DOTQT_QD166 = "update bhc_ckt_qd166 set TT_TK = ? where id in (?)";

    public static final String UPDATE_TRINHKY_C87_THN_DOTQT_QD166 = "update bhc_ckt_87_thn set TT_TK = ? where id in (?)";

    public static final String UPDATE_TRINHKY_C93_THN_DOTQT_QD166 = "update BHC_CKT_93_THN set TT_TK = ? where id in (?)";

    public static final String UPDATE_HUYPHEDUYET_TP_THN_DOTQT_QD166 = "update bhc_ckt_qd166 set IS_PCKY = ?, PATH_FILE_PC = ? where id in (?)";

    public static final String UPDATE_HUYPHEDUYET_GD_THN_DOTQT_QD166 = "update bhc_ckt_qd166 set IS_GDKY = ?, PATH_FILE_GD = ? where id in (?)";

    public static final String UPDATE_PHEDUYET_TP_THN_DOTQT_QD166 = "update bhc_ckt_qd166 set TT_PD_PC = ? where id in (?)";

    public static final String UPDATE_PHEDUYET_GD_THN_DOTQT_QD166 = "update bhc_ckt_qd166 set TT_PD_GD = ? where id in (?)";

    public static final String UPDATE_TRINHKY_ODTS_DOTQT_QD166 = "update odts_dotqt_qd166 set trang_thai = ? where id in (?) and nvl(TT_PHEDUYET, 0) <> 1";

    public static final String UPDATE_PHEDUYET_TP_ODTS_DOTQT_QD166 = "update odts_dotqt_qd166 set TT_PHEDUYET = ? where id in (?)";

    public static final String UPDATE_PHEDUYET_GD_ODTS_DOTQT_QD166 = "update odts_dotqt_qd166 set TT_PHEDUYET_GD = ? where id in (?)";

    public static final String UPDATE_PHEDUYET_VT_ODTS_DOTQT_QD166 = "update odts_dotqt_qd166 set TT_PHEDUYET_VT = ? where id in (?)";

    public static final String UPDATE_HUYPHEDUYET_TP_ODTS_DOTQT_QD166 = "update odts_dotqt_qd166 set TP_KY = ?, TT_PHEDUYET = ?, PATH_FILE_TP = ?, LYDO_HUYPD_TP = ? where id in (?)";

    public static final String UPDATE_HUYPHEDUYET_GD_ODTS_DOTQT_QD166 = "update odts_dotqt_qd166 set GD_KY = ?, TT_PHEDUYET_GD = ?, PATH_FILE_GD = ?, LYDO_HUYPD_GD = ? where id in (?)";

    public static final String UPDATE_HUYPHEDUYET_VT_ODTS_DOTQT_QD166 = "update odts_dotqt_qd166 set VT_KY = ?, TT_PHEDUYET_VT = ?, PATH_FILE_VT = ?, LYDO_HUYPD_VT = ? where id in (?)";

    public static final String UPDATE_PHEDUYET_XD_HO_SO_QD166 = "update xd_ho_so_qd166 set ngay_phe_duyet = ?, nguoi_phe_duyet = ?, trang_thai_pd = ? where id=?";

    public static final String SQL_UPDATE_XD_HOSO_TAOC97 = "update xd_ho_so set trang_thai_ckt = ? where id=?";

    public static final String SQL_UPDATE_XD_HOSO_TAOC90 = "update xd_ho_so set trang_thai_ckt = ? where id=?";

    public static final String UPDATE_IS_HUY_XML_QD166 = "update bhc_ckt_qd166 set ngay_huy = ?, nguoi_huy = ?, is_huy = 1 where id=?";

    public static final String UPDATE_IS_HUY_CKT_QD166 = "update bhc_ckt_qd166 set ngay_huy = ?, nguoi_huy = ?, is_huy = 1 where ten_baocao = ? and path_file=? and label='KT'";

    public static final String UPDATE_IS_HUY_C72_QD166 = "update bhc_c72_ht_qd166 set is_huy = 1 where path_file=?";

    public static final String UPDATE_HUYPHEDUYET_TP_XD_QDQT_QD166 = "update xd_ho_so_qd166 set TP_KY = ?, TRANG_THAI_PD = ?, PATH_FILE_TP = ?, LYDO_HUYPD_TP=? where id in (?)";

    public static final String UPDATE_HUYPHEDUYET_GD_XD_QDQT_QD166 = "update xd_ho_so_qd166 set GD_KY = ?, TT_PHEDUYET_GD = ?, PATH_FILE_GD = ?, LYDO_HUYPD_GD=? where id in (?)";

    public static final String UPDATE_HUYPHEDUYET_VT_XD_QDQT_QD166 = "update xd_ho_so_qd166 set VT_KY = ?, TT_PHEDUYET_VT = ?, PATH_FILE_VT = ?, LYDO_HUYPD_VT=? where id in (?)";


    public static final String UPDATE_PHEDUYET_TP_XD_QDQT_QD166 = "update xd_ho_so_qd166 set TRANG_THAI_PD = ? where id in (?)";

    public static final String UPDATE_PHEDUYET_GD_XD_QDQT_QD166 = "update xd_ho_so_qd166 set TT_PHEDUYET_GD = ? where id in (?)";

    public static final String UPDATE_PHEDUYET_VT_XD_QDQT_QD166 = "update xd_ho_so_qd166 set TT_PHEDUYET_VT = ? where id in (?)";


    public static final String UPDATE_HUYPHEDUYET_TP_XD_C90_QD166 = "update bhc_ckt_qd166 set IS_PCKY = ?, TT_PD_PC = ?, PATH_FILE_PC = ?, LYDO_HUYPD_TP=? where id in (?)";

    public static final String UPDATE_HUYPHEDUYET_GD_XD_C90_QD166 = "update bhc_ckt_qd166 set IS_GDKY = ?, TT_PD_GD = ?, PATH_FILE_GD = ?, LYDO_HUYPD_GD=? where id in (?)";


    public static final String UPDATE_PHEDUYET_TP_XD_C90_QD166 = "update bhc_ckt_qd166 set TT_PD_PC = ? where id in (?)";

    public static final String UPDATE_PHEDUYET_GD_XD_C90_QD166 = "update bhc_ckt_qd166 set TT_PD_GD = ? where id in (?)";


    public static final String UPDATE_HUYPHEDUYET_TP_XD_C97_QD166 = "update bhc_ckt_qd166 set IS_PCKY = ?, TT_PD_PC = ?, PATH_FILE_PC = ?, LYDO_HUYPD_TP=? where id in (?)";

    public static final String UPDATE_HUYPHEDUYET_GD_XD_C97_QD166 = "update bhc_ckt_qd166 set IS_GDKY = ?, TT_PD_GD = ?, PATH_FILE_GD = ?, LYDO_HUYPD_GD=? where id in (?)";

    public static final String UPDATE_PHEDUYET_TP_XD_C97_QD166 = "update bhc_ckt_qd166 set TT_PD_PC = ? where id in (?)";

    public static final String UPDATE_PHEDUYET_GD_XD_C97_QD166 = "update bhc_ckt_qd166 set TT_PD_GD = ? where id in (?)";

    public static final String UPDATE_HUYPHEDUYET_TP_BHC_C72A_QD166 = "update bhc_ckt_qd166 set IS_PCKY = ?, TT_PD_PC = ?, PATH_FILE_PC = ?, LYDO_HUYPD_TP=? where id in (?)";

    public static final String UPDATE_HUYPHEDUYET_GD_BHC_C72A_QD166 = "update bhc_ckt_qd166 set IS_GDKY = ?, TT_PD_GD = ?, PATH_FILE_GD = ?, LYDO_HUYPD_GD=? where id in (?)";

    public static final String UPDATE_PHEDUYET_TP_BHC_C72A_QD166 = "update bhc_ckt_qd166 set TT_PD_PC = ? where id in (?)";

    public static final String UPDATE_PHEDUYET_GD_BHC_C72A_QD166 = "update bhc_ckt_qd166 set TT_PD_GD = ? where id in (?)";



    /* and ma_tinh=? and DLY_CAP1=?" +
        " and THANG_DC=? and ATM=? and LAN_CHUYEN=?*/

    public static final String SQL_INSERT_BHC_MS10_HT_QD166 = "INSERT INTO bhc_ms10_ht_qd166(" +
        "ID," +
        "TEN_BC," +
        "TYPE," +
        "LOAI_TROCAP," +
        "LOAI_DC," +
        "TEN_DC," +
        "HO_TEN," +
        "MA_SO_BHXH," +
        "SO_BHXH," +
        "LY_DO," +
        "THANG_HUONG," +
        "SOTIEN_HT," +
        "THANG_TL," +
        "SOTIEN_TL," +
        "TONG_TIEN_DL," +
        "GHI_CHU," +
        "TEN_NGUON," +
        "DAI_DIEN," +
        "LOAI_CD," +
        "DL_C1," +
        "TEN_HUYEN," +
        "DL_C2," +
        "TEN_XA," +
        "DL_C3," +
        "MA_NGUON," +
        "MA_CD," +
        "MA_NKP_KT," +
        "MA_CD_KT," +
        "TEN," +
        "HO," +
        "DAIDIEN1," +
        "DAIDIEN2," +
        "ATM," +
        "NGAY_SINH," +
        "SO_CHL," +
        "SOTIEN_CL," +
        "SO_ID," +
        "MA_DS," +
        "LY_DO_CL," +
        "SDT," +
        "KHAU_TRU," +
        "KIEU_IN," +
        "IS_HUY," +
        "IS_LOI," +
        "PATH_FILE," +
        "NGUOI_TAO," +
        "NGAY_TAO," +
        "LAN_CHUYEN," +
        "THANG_DC," +
        "MA_TINH," +
        "TEN_CD_GOC," +
        "TRC_THANG_TRC," +
        "SOTIEN_TANG," +
        "SOTIEN_GIAM," +
        "TRC_THANG," +
        "TONG_TIEN," +
        "SOTIEN_TH," +
        "STK," +
        "DIEU_CHINH," +
        "STK_TRC," +
        "PHUONG_THUC_TRA," +
        "THANG_NAM_CT," +
        "THANG_TG," +
        "SOTIEN_PT," +
        "TIEN_PHAITHU," +
        "MA_DC," +
        "LAN_DC," +
        "CL_2THANG," +
        "TU_THANG_CL," +
        "DEN_THANG_CL," +
        "ID_REF," +
        "TEN_CTK," +
        "MA_NH" +
        ")values(bhc_ms10_ht_qd166_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?," +
        "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String SQL_INSERT_XD_C97_QD166 = "INSERT INTO xd_c97_qd166 a(" +
        "    a.id," +
        "    a.id_hs," +
        "    a.ma_cqbhxh," +
        "    a.ten_cqbhxh," +
        "    a.ho_ten," +
        "    a.so_so," +
        "    a.ma_so_bhxh," +
        "    a.khau_tru," +
        "    a.tien_gd," +
        "    a.tc_bhxh_1lan," +
        "    a.tc_1lan_nghihuu," +
        "    a.tc_1lan_09," +
        "    a.tc_1lan_tnld_bnn," +
        "    a.tc_tuat_tnld," +
        "    a.tc_maitang," +
        "    a.tc_tuat_1lan," +
        "    a.tc_kv1lan," +
        "    a.tc_1lan_rancngoai," +
        "    a.mua_ptvp," +
        "    a.dia_chi," +
        "    a.atm," +
        "    a.ma_huong," +
        "    a.trang_thai," +
        "    a.huyen," +
        "    a.type," +
        "    a.che_do," +
        "    a.ten_huyen," +
        "    a.so_qd," +
        "    a.dot_ckt," +
        "    a.ngay_chuyen," +
        "    a.cu_tru," +
        "    a.nsnn," +
        "    a.ma_nkp," +
        "    a.ma_cd," +
        "    a.ngay_qd," +
        "    a.xa," +
        "    a.ten_xa," +
        "    a.to_thon," +
        "    a.ten_to," +
        "    a.ngay_huong," +
        "    a.thang_hg," +
        "    a.nam_hg," +
        "    a.ve_theo," +
        "    a.ngay_chinh," +
        "    a.tien_1l," +
        "    a.cmt," +
        "    a.stk," +
        "    a.ten_ctk," +
        "    a.ten_nh," +
        "    a.tu_nguyen," +
        "    a.ten," +
        "    a.tc_bhxh_1lan_truocdc," +
        "    a.tc_1lan_nghihuu_truocdc," +
        "    a.tc_1lan_09_truocdc," +
        "    a.tc_1lan_tnldbnn_truocdc," +
        "    a.tc_tuat_tnld_truocdc," +
        "    a.tc_maitang_truocdc," +
        "    a.tc_tuat_1lan_truocdc," +
        "    a.tc_kv1lan_truocdc," +
        "    a.tc_1lan_rancngoai_truocdc," +
        "    a.mua_ptvp_truocdc," +
        "    a.is_dc," +
        "    a.is_loi," +
        "    a.path_file," +
        "    a.ten_file," +
        "    a.is_huy," +
        "    a.nguoi_tao," +
        "    a.ngay_tao," +
        "    a.tu_ngay_dl," +
        "    a.den_ngay_dl," +
        "    a.ma_tinh," +
        "    a.thang_bc," +
        "    a.ma_user," +
        "    a.CMND," +
        "    a.THANG_HUONG_KT," +
        "    a.NAM_HUONG_KT," +
        "    a.MA_CQBH_CHITRA," +
        "    a.TEN_CQBH_CHITRA," +
        "    a.MA_CQBH_CD," +
        "    a.TEN_CQBH_CD," +
        "    a.LOAI_BHXH," +
        "    a.IS_TRONG_TINH," +
        "    a.IS_LAMTRON," +
        "    a.THANG_THUC_CHI," +
        "    a.LAN_CHUYEN," +
        "    a.TIEN_GD_TRUOCDC," +
        "    a.BHXH_NOI_DEN," +
        "    a.ID_REF," +
        "    a.MA_NH," +
        "    a.SDT," +
        "    a.MA_DVQL," +
        "    a.TC_BHXH_1LAN_KT," +
        "    a.TC_1LAN_NGHIHUU_KT," +
        "    a.TC_1LAN_09_KT," +
        "    a.TC_1LAN_TNLD_BNN_KT," +
        "    a.TC_TUAT_TNLD_KT," +
        "    a.TC_MAITANG_KT," +
        "    a.TC_TUAT_1LAN_KT," +
        "    a.TC_KV1LAN_KT," +
        "    a.TC_1LAN_RANCNGOAI_KT," +
        "    a.MUA_PTVP_KT," +
        "    a.TIEN_GD_KT," +
        "    a.NGAY_SINH," +
        "    a.GIOI_TINH," +
        "    a.MA_DS," +
        "    a.NHOM_NH," +
        "    a.DANH_SACH_HS," +
        "    a.TS_DUOC_LINH" +
        ")VALUES(xd_c97_qd166_SEQ.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?," +
        "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_XD_CKT_C90_TH_QD166 = "INSERT INTO XD_CKT_C90_TH_QD166(" +
        "TEN_BC," +
        "MA_TINH," +
        "MA_DVI," +
        "TEN_DVI," +
        "DIA_CHI," +
        "SO_QD," +
        "TIEN_HT," +
        "SO_TK," +
        "MA_NH," +
        "TEN_NH," +
        "TAI_KHOAN," +
        "PATH_FILE," +
        "TEN_FILE," +
        "ID_XML," +
        "TRANG_THAI," +
        "LAN_TAO," +
        "DOT_CKT," +
        "THANG_CKT," +
        "MA_CQBH," +
        "TU_NGAY," +
        "DEN_NGAY," +
        "SO_NGUOI," +
        "ID" +
        ")VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,XD_C90_TONG_HOP_SEQ.nextval)";

    public static final String INSERT_XD_CKT_C90_QD166 = "INSERT INTO xd_ckt_c90_qd166(" +
        "ID," +
        "TEN_BC," +
        "ma_tinh," +
        "ma_dvi," +
        "ten_dvi," +
        "dia_chi," +
        "so_qd," +
        "tien_ht," +
        "so_tk," +
        "ma_nh," +
        "ten_nh," +
        "path_file," +
        "ten_file, " +
        "is_loi," +
        "nguoi_lap," +
        "ngay_lap," +
        "tp_ky, " +
        "gd_ky, " +
        "nl_ky, " +
        "tu_ngay," +
        "den_ngay," +
        "id_ref," +
        "id_xml," +
        "trang_thai," +
        "nguoi_tp," +
        "ngay_tp, " +
        "nguoi_gd," +
        "ngay_gd," +
        "LAN_TAO," +
        "DOT_CKT," +
        "THANG_CKT," +
        "ID_XD_HS," +
        "HS_ID," +
        "SO_SO," +
        "HO_TEN," +
        "MA_CQBH" +
        ")values(xd_ckt_c90_qd166_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";


    public static final String UPDATE_TTTAODL_XD_DIEUTRA_QD166 = "UPDATE xd_dieutralai SET TT_TAODL = ?, ID_REF = ? where id = ?";

    public static final String UPDATE_TTTAODL_PHIEU_DE_NGHI21_QD166 = "UPDATE XD_DE_NGHI_THU_21HSB SET TT_TAODL = ?, ID_REF = ? where id = ?";

    public static final String UPDATE_ID_XML_BHC_C72_HT_QD166 = "UPDATE BHC_C72_HT_QD166 SET ID_XML = ? where ID_REF = ?";

    public static final String UPDATE_ID_XML_BHC_MS10_HT_QD166 = "UPDATE bhc_ms10_ht_qd166 SET ID_XML = ? where ID_REF = ?";

    public static final String SQL_UPDATE_SOHOSO_ODTS_DOTQT = "UPDATE ODTS_DOTQT SET SO_HO_SO = ? WHERE MA_CQBH = ?, MA_DVI = ?, MA_QT = ?";


    public static final String INSERT_TCKT_TD_BCTC_HDR = "INSERT INTO tckt_td_bctc_hdr (" +
        "    ma_bc," +
        "    ma_dvql," +
        "    thang," +
        "    quy," +
        "    nam," +
        "    lan_chuyen," +
        "    trang_thai," +
        "    user_name," +
        "    user_date," +
        "    ma_tinh," +
        "    phan_mem," +
        "    is_td," +
        "    path_file," +
        "    ten_file," +
        "    ly_do_huy," +
        "    is_pb01," +
        "    nguoi_chuyen," +
        "    ngay_chuyen," +
        "    lan_td," +
        "    ma_cqbh_td," +
        "    ly_do_tm," +
        "    nguoi_td," +
        "    ngay_td," +
        "    ma_cqbh_tddv," +
        "    ly_do_tmdv," +
        "    nguoi_tddv," +
        "    ngay_tddv," +
        "    trang_thai_huy," +
        "    lan_chuyen_td," +
        "    ID_TCKT_BCTC_HDR," +
        "    id," +
        "    TRANG_THAI_TW" +
        ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String UPDATE_TCKT_TD_BCTC_DTL = "UPDATE TCKT_TD_BCTC_DTL set" +
        "    ma_bc =? ," +
        "    ma_dvql =? ," +
        "    thang =? ," +
        "    quy =? ," +
        "    nam =? ," +
        "    ma_ct =? ," +
        "    so_dvi_dn =? ," +
        "    so_td =? ," +
        "    lan_chuyen =? ," +
        "    trang_thai =? ," +
        "    user_name =? ," +
        "    user_date =? ," +
        "    ma_tinh =? ," +
        "    phan_mem =? ," +
        "    is_td =? ," +
        "    path_file =? ," +
        "    ten_file =? ," +
        "    ly_do_huy =? ," +
        "    st_kp_namtrc =? ," +
        "    st_dutoan =? ," +
        "    st_chi_qt =? ," +
        "    st_kp_namsau =? ," +
        "    is_pb01 =? ," +
        "    nguoi_chuyen =? ," +
        "    ngay_chuyen =? ," +
        "    lan_td =? ," +
        "    ma_cqbh_td =? ," +
        "    ly_do_tm =? ," +
        "    nguoi_td =? ," +
        "    ngay_td =? ," +
        "    ma_cqbh_tddv =? ," +
        "    ly_do_tmdv =? ," +
        "    nguoi_tddv =? ," +
        "    ngay_tddv =? ," +
        "    trang_thai_huy =? ," +
        "    lan_chuyen_td =? ," +
        "    id_tdtc_baocao =? ," +
        "    PATH_FILE_LYDOTM =? ," +
        "    PATH_FILE_LYDOTM_DV =? ," +
        "    NAME_FILE_LYDOTM =? ," +
        "    NAME_FILE_LYDOTM_DV =? ," +
        "    TRANG_THAI_TW =? ," +
        "    NGUOI_NHAN =? ," +
        "    NGAY_NHAN =? ," +
        "    ST_KP_NAMTRC_TD =? ," +
        "    ST_DUTOAN_TD =? ," +
        "    ST_CHI_QT_TD =? ," +
        "    ST_KP_NAMSAU_TD =? " +
        "    where id=? and ma_bc =?";

    public static final String INSERT_TCKT_TD_BCTC_DTL = "INSERT INTO tckt_td_bctc_dtl (" +
        "    id," +
        "    ma_bc," +
        "    ma_dvql," +
        "    thang," +
        "    quy," +
        "    nam," +
        "    ma_ct," +
        "    so_dvi_dn," +
        "    so_td," +
        "    lan_chuyen," +
        "    trang_thai," +
        "    ma_tinh," +
        "    phan_mem," +
        "    is_td," +
        "    path_file," +
        "    ten_file," +
        "    ly_do_huy," +
        "    st_kp_namtrc," +
        "    st_dutoan," +
        "    st_chi_qt," +
        "    st_kp_namsau," +
        "    is_pb01," +
        "    lan_td," +
        "    ma_cqbh_td," +
        "    ly_do_tm," +
        "    nguoi_td," +
        "    ngay_td," +
        "    ma_cqbh_tddv," +
        "    ly_do_tmdv," +
        "    nguoi_tddv," +
        "    ngay_tddv," +
        "    trang_thai_huy," +
        "    lan_chuyen_td," +
        "    id_tdtc_baocao," +
        "    PATH_FILE_LYDOTM," +
        "    PATH_FILE_LYDOTM_DV," +
        "    NAME_FILE_LYDOTM," +
        "    NAME_FILE_LYDOTM_DV," +
        "    TRANG_THAI_TW," +
        "    NGUOI_NHAN," +
        "    NGAY_NHAN," +
        "    ST_KP_NAMTRC_TD," +
        "    ST_DUTOAN_TD," +
        "    ST_CHI_QT_TD," +
        "    ST_KP_NAMSAU_TD" +
        ") VALUES (tckt_td_bctc_dtl_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";


    public static final String INSERT_TCKT_KYSO_TD_BCTC_DTL = "INSERT INTO kyso_hdr (" +
        "    id_ref," +
        "    ma_bc," +
        "    ma_dvql," +
        "    thang," +
        "    quy," +
        "    nam," +
        "    nguoi_tao," +
        "    ngay_tao," +
        "    ma_tinh," +
        "    phan_mem," +
        "    path_file," +
        "    ten_file," +
        "    lan_chuyen," +
        "    lan_td," +
        "    id," +
        "    LAN_TAO," +
        "    IS_THAM_DINH" +
        ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_BC_NGANH_KYSO_HDR = "INSERT INTO kyso_hdr (" +
        "    id_ref," +
        "    ma_bc," +
        "    ma_dvql," +
        "    nam," +
        "    nguoi_tao," +
        "    ngay_tao," +
        "    ma_tinh," +
        "    path_file," +
        "    ten_file," +
        "    id," +
        "    LAN_TAO," +
        "    IS_THAM_DINH," +
        "    IS_BCN_THU," +
        "    SO_THONGBAO" +
        ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_TCKT_KYSO_TD_BCTHU_M02c_BB = "INSERT INTO kyso_hdr (" +
        "    id_ref," +
        "    ma_bc," +
        "    nam," +
        "    nguoi_tao," +
        "    ngay_tao," +
        "    ma_tinh," +
        "    phan_mem," +
        "    path_file," +
        "    ten_file," +
        "    lan_td," +
        "    id," +
        "    MA_DVQL," +
        "    LAN_TAO," +
        "    IS_THAM_DINH," +
        "    LAN_CHUYEN" +
        ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_CHIPHI_THUOC_KHANG_HIV = "INSERT INTO CHIPHI_THUOC_KHANG_HIV_DTL (" +
        " ID " +
        ",MA_BC " +
        ",MA_SO " +
        ",MA_DVQL " +
        ",MA_TINH " +
        ",NAM " +
        ",DN_TONGCP_CSYT " +
        ",DN_DAQT_TONG " +
        ",DN_DAQT_QUYBHYT " +
        ",DN_DAQT_CCTRA " +
        ",DN_TH_TONG " +
        ",DN_TH_CSYT " +
        ",DN_TH_NHATHAU " +
        ",DN_CP_CHUAQT " +
        ",ID_HDR " +
        ",NGUOI_TAO " +
        ",NGAY_TAO" +
        ") VALUES (CHIPHI_THUOC_KHANG_HIV_DTL_SEQ.nextval" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",sysdate)";

    public static final String INSERT_CHIPHI_THUOC_KHANG_HIV_03b5BB = "INSERT INTO CHIPHI_THUOC_KHANG_HIV_DTL (" +
        " ID " +
        ",MA_BC " +
        ",MA_SO " +
        ",MA_DVQL " +
        ",MA_TINH " +
        ",NAM " +
        ",MA_CT " +
        ",SO_DN" +
        ",ID_HDR " +
        ",NGUOI_TAO " +
        ",NGAY_TAO" +
        ") VALUES (CHIPHI_THUOC_KHANG_HIV_DTL_SEQ.nextval" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",sysdate)";

    public static final String INSERT_CHIPHI_QDCA_DN_DTL = "INSERT INTO QDCA_DN_DTL (" +
        " ID " +
        ",MA_BC " +
        ",MA_SO " +
        ",MA_DVQL " +
        ",MA_TINH " +
        ",NAM " +
        ",MA_CT " +
        ",SO_DN" +
        ",ID_HDR " +
        ",NGUOI_TAO " +
        ",NGAY_TAO" +
        ") VALUES (QDCA_DN_DTL_SEQ.nextval" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",?" +
        ",sysdate)";

    public static final String UPDATE_TRINH_KY_BYID  = "update kyso_hdr set ngay_tk=sysdate, nguoi_tk=?, trinh_ky=? where id=? and trinh_ky <> 1" +
        " and nvl(IS_KY_GD, 0) = 0" +
        " and nvl(IS_KY_GIAMDINH, 0) = 0" +
        " and nvl(IS_KY_TD, 0) = 0" +
        " and nvl(IS_KY_TPTC, 0) = 0" +
        " and nvl(IS_KY_TPTD, 0) = 0" +
        " and nvl(IS_KY_TPTHU, 0) = 0" +
        " and nvl(IS_KY_VT, 0) = 0" +
        " and nvl(IS_KY_VUTRUONG, 0) = 0 ";

    public static final String UPDATE_HUY_TRINH_KY_BYID  = "update kyso_hdr set ngay_tk=sysdate, nguoi_tk=?, trinh_ky=? where id=? and trinh_ky=1" +
        " and nvl(IS_KY_GD, 0) <> 1" +
        " and nvl(IS_KY_GIAMDINH, 0) <> 1" +
        " and nvl(IS_KY_TD, 0) <> 1" +
        " and nvl(IS_KY_TPTC, 0) <> 1" +
        " and nvl(IS_KY_TPTD, 0) <> 1" +
        " and nvl(IS_KY_TPTHU, 0) <> 1" +
        " and nvl(IS_KY_VT, 0) <> 1" +
        " and nvl(IS_KY_VUTRUONG, 0) <> 1 ";

    public static final String UPDATE_THAMDINH_BC_THU_DTL_M02aBB  = "update THAMDINH_BC_THU_DTL set SO_THAM_DINH = ?, SO_CHENH_LECH = nvl(SO_DON_VI_DE_NGHI,0) - ? " +
        "   WHERE ma_tinh=? AND nam = ? AND ma_bc = ? AND ma_chi_tieu = ? AND id_hdr = ? ";
    public static final String UPDATE_THAMDINH_BC_THU_DTL_M02bBB  = "update THAMDINH_BC_THU_DTL set " +
        " so_don_vi = ?, so_don_vi_chenh_lech = nvl(so_don_vi_de_nghi,0) - ?," +
        " so_lao_dong = ?, so_lao_dong_chenh_lech = nvl(so_lao_dong_de_nghi,0) - ?," +
        " tien_dong = ?, tien_dong_chenh_lech = nvl(tien_dong_de_nghi,0) - ?," +
        " tien_lai = ?, tien_lai_chenh_lech = nvl(tien_lai_de_nghi,0) - ?" +
        " WHERE ma_tinh=? AND nam = ? AND ma_bc = ? AND ma_chi_tieu = ? AND id_hdr = ?";
    public static final String UPDATE_THAMDINH_BC_THU_DTL_M02cBB_TIENDONG  = "update THAMDINH_BC_THU_DTL set " +
        "TIEN_BHXH_DK = ?, " +
        "TIEN_BHYT_DK = ?, " +
        "TIEN_BHTN_DK = ?, " +
        "TIEN_BHXH_PT = ?, " +
        "TIEN_BHYT_PT = ?, " +
        "TIEN_BHTN_PT = ?, " +
        "TIEN_BHXH_DT = ?, " +
        "TIEN_BHYT_DT = ?, " +
        "TIEN_BHTN_DT = ?, " +
        "TIEN_BHXH_CK = ?, " +
        "TIEN_BHYT_CK = ?, " +
        "TIEN_BHTN_CK = ?," +
        "LAI_BHXH_DK = 0, " +
        "LAI_BHYT_DK = 0, " +
        "LAI_BHTN_DK = 0, " +
        "LAI_BHXH_PT = 0, " +
        "LAI_BHYT_PT = 0, " +
        "LAI_BHTN_PT = 0, " +
        "LAI_BHXH_DT = 0, " +
        "LAI_BHYT_DT = 0, " +
        "LAI_BHTN_DT = 0, " +
        "LAI_BHXH_CK = 0, " +
        "LAI_BHYT_CK = 0, " +
        "LAI_BHTN_CK = 0 " +
        "WHERE ma_tinh=? AND nam = ? AND ma_bc = ? AND MA_BHXH = ? AND id_hdr = ? ";
    public static final String UPDATE_THAMDINH_BC_THU_DTL_M02cBB_TIENLAI  = "update THAMDINH_BC_THU_DTL set " +
        "LAI_BHXH_DK = ?, " +
        "LAI_BHYT_DK = ?, " +
        "LAI_BHTN_DK = ?, " +
        "LAI_BHXH_PT = ?, " +
        "LAI_BHYT_PT = ?, " +
        "LAI_BHTN_PT = ?, " +
        "LAI_BHXH_DT = ?, " +
        "LAI_BHYT_DT = ?, " +
        "LAI_BHTN_DT = ?, " +
        "LAI_BHXH_CK = ?, " +
        "LAI_BHYT_CK = ?, " +
        "LAI_BHTN_CK = ?" +
        "WHERE ma_tinh = ? AND nam = ? AND ma_bc = ? AND MA_BHXH = ? AND id_hdr = ? ";

    public static final Integer COL_MA_TINH = 0;
    public static final Integer COL_TEN_TINH = 1;
    public static final Integer COL_DN_TONGCP_CSYT = 2;
    public static final Integer COL_DN_DAQT_TONG = 3;
    public static final Integer COL_DN_DAQT_QUYBHYT = 4;
    public static final Integer COL_DN_DAQT_CCTRA = 5;
    public static final Integer COL_DN_TH_TONG = 6;
    public static final Integer COL_DN_TH_CSYT = 7;
    public static final Integer COL_DN_TH_NHATHAU = 8;
    public static final Integer COL_DN_CP_CHUAQT = 9;
    public static final Integer COL_NAM = 10;

    public static final Integer M02a_COL_MA_CHI_TIEU = 0;
    public static final Integer M02a_COL_TEN_CHI_TIEU = 1;
    public static final Integer M02a_COL_MA_SO = 2;
    public static final Integer M02a_COL_SO_THAMDINH = 3;

    public static final Integer M02b_COL_MA_CHI_TIEU = 0;
    public static final Integer M02b_COL_TEN_CHI_TIEU = 1;
    public static final Integer M02b_COL_MA_SO = 2;
    public static final Integer M02b_COL_SO_DON_VI = 3;
    public static final Integer M02b_COL_SO_NGUOI = 4;
    public static final Integer M02b_COL_TIEN_DONG = 5;
    public static final Integer M02b_COL_TIEN_LAI = 6;

    public static final Integer M02c_COL_MA_CQBH = 0;
    public static final Integer M02c_COL_TEN_CQBH = 1;
    public static final Integer M02c_COL_TONGKYTRUOC = 2;
    public static final Integer M02c_COL_KYTRUOCBHXH = 3;
    public static final Integer M02c_COL_KYTRUOCBHYT = 4;
    public static final Integer M02c_COL_KYTRUOCBHTN = 5;
    public static final Integer M02c_COL_TONGPHAITHU = 6;
    public static final Integer M02c_COL_PHAITHUBHXH = 7;
    public static final Integer M02c_COL_PHAITHUBHYT = 8;
    public static final Integer M02c_COL_PHAITHUBHTN = 9;
    public static final Integer M02c_COL_TONGDATHU = 10;
    public static final Integer M02c_COL_DATHUBHXH = 11;
    public static final Integer M02c_COL_DATHUBHYT = 12;
    public static final Integer M02c_COL_DATHUBHTN = 13;
    public static final Integer M02c_COL_TONGCONPHAITHU = 14;
    public static final Integer M02c_COL_CONPHAITHUBHXH = 15;
    public static final Integer M02c_COL_CONPHAITHUBHYT = 16;
    public static final Integer M02c_COL_CONPHAITHUBHTN = 17;
    public static final Integer M02c_COL_LOAITIENDONG = 18;

    public static final String SQL_GET_LAN_IMPORT = "select max(t.dot) from CHIPHI_THUOC_KHANG_HIV_HDR t "
        + " where t.nam = ? ";

    public static final String INSERT_THAM_DINH_CSYT_HDR = "INSERT INTO tham_dinh_csyt_hdr (" +
        "    id," +
        "    ma_bc," +
        "    ma_dvql," +
        "    thang," +
        "    quy," +
        "    nam," +
        "    is_bieumau," +
        "    lan_chuyen," +
        "    trang_thai," +
        "    nguoi_tc," +
        "    ngay_tc," +
        "    ma_tinh," +
        "    phan_mem," +
        "    path_file," +
        "    ten_file," +
        "    ly_do_huy," +
        "    nguoi_chuyen," +
        "    ngay_chuyen," +
        "    id_csyt_dn," +
        "    id_csyt_td," +
        "    ma_cqbh_td," +
        "    nguoi_td," +
        "    ngay_td," +
        "    trang_thai_tw," +
        "    lan_td," +
        "    ma_cqbh_tddv," +
        "    nguoi_tddv," +
        "    ngay_tddv" +
        ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_THAM_DINH_CSXH_HDR = "INSERT INTO THAM_DINH_CSXH_HDR(" +
        "ID," +
        "MA_BC," +
        "MA_DVQL," +
        "THANG," +
        "QUY," +
        "NAM," +
        "LAN_CHUYEN," +
        "TRANG_THAI," +
        "NGUOI_TC," +
        "NGAY_TC," +
        "MA_TINH," +
        "PHAN_MEM," +
        "PATH_FILE," +
        "TEN_FILE," +
        "LY_DO_HUY," +
        "NGUOI_CHUYEN," +
        "NGAY_CHUYEN," +
        "ID_CSXH_DN," +
        "ID_CSXH_TD," +
        "MA_CQBH_TD," +
        "NGUOI_TD," +
        "NGAY_TD," +
        "TRANG_THAI_TW," +
        "LAN_TD," +
        "MA_CQBH_TDDV," +
        "NGUOI_TDDV," +
        "NGAY_TDDV" +
        ")VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_THAM_DINH_CSXH_DTL = "INSERT INTO THAM_DINH_CSXH_DTL(" +
        "ID," +
        "MA_BC," +
        "MA_CT," +
        "MA_DVQL," +
        "THANG," +
        "QUY," +
        "NAM," +
        "SO_DN," +
        "SO_TD," +
        "SO_CL," +
        "LAN_CHUYEN," +
        "TRANG_THAI," +
        "NGUOI_TC," +
        "NGAY_TC," +
        "MA_TINH," +
        "PHAN_MEM," +
        "PATH_FILE," +
        "TEN_FILE," +
        "LY_DO_HUY," +
        "NGUOI_CHUYEN," +
        "NGAY_CHUYEN," +
        "ID_HDR," +
        "TRANG_THAI_TW," +
        "MA_CQBH_TD," +
        "NGUOI_TD," +
        "NGAY_TD," +
        "LAN_TD," +
        "MA_CQBH_TDDV," +
        "NGUOI_TDDV," +
        "NGAY_TDDV," +
        "LYDO_TM," +
        "LYDO_TMDV" +
        ")VALUES(THAM_DINH_CSXH_DTL_SEQ.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_THAM_DINH_CSYT_DTL = "INSERT INTO THAM_DINH_CSYT_DTL(" +
        "    ID," +
        "    MA_BC," +
        "    MA_CT," +
        "    MA_DVQL," +
        "    THANG," +
        "    QUY," +
        "    NAM," +
        "    ST_BHYT_DN," +
        "    ST_BHYT_TD," +
        "    ST_BHYT_CL," +
        "    ST_DP_20_DN," +
        "    ST_DP_20_TD," +
        "    ST_DP_20_CL," +
        "    ST_TONG_SO_DN," +
        "    ST_TONG_SO_TD," +
        "    ST_TONG_SO_CL," +
        "    SO_DN," +
        "    SO_TD," +
        "    TRC_2019_DN," +
        "    TRC_2019_TD," +
        "    TRC_2019_CL," +
        "    NAM_2019_DN," +
        "    NAM_2019_TD," +
        "    NAM_2019_CL," +
        "    TRC_2020_DN," +
        "    TRC_2020_TD," +
        "    TRC_2020_CL," +
        "    IS_BIEUMAU," +
        "    LAN_CHUYEN," +
        "    TRANG_THAI," +
        "    NGUOI_TC," +
        "    NGAY_TC," +
        "    MA_TINH," +
        "    PHAN_MEM," +
        "    PATH_FILE," +
        "    TEN_FILE," +
        "    LY_DO_HUY," +
        "    NGUOI_CHUYEN," +
        "    NGAY_CHUYEN," +
        "    ID_HDR," +
        "    TRANG_THAI_TW," +
        "    MA_CQBH_TD," +
        "    NGUOI_TD," +
        "    NGAY_TD," +
        "    LAN_TD," +
        "    NAM1_DN," +
        "    NAM2_DN," +
        "    NAM3_DN," +
        "    NAM4_DN," +
        "    NAM5_DN," +
        "    NAM6_DN," +
        "    NAM1_TD," +
        "    NAM2_TD," +
        "    NAM3_TD," +
        "    NAM4_TD," +
        "    NAM5_TD," +
        "    NAM6_TD," +
        "    NAM1_CL," +
        "    NAM2_CL," +
        "    NAM3_CL," +
        "    NAM4_CL," +
        "    NAM5_CL," +
        "    NAM6_CL," +
        "    MA_CQBH_TDDV," +
        "    NGUOI_TDDV," +
        "    NGAY_TDDV," +
        "    LYDO_TM," +
        "    LYDO_TMDV" +
        ")VALUES (THAM_DINH_CSYT_DTL_SEQ.nextval, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String UPDATE_THAM_DINH_CSYT_DTL = "UPDATE THAM_DINH_CSYT_DTL SET" +
        "    MA_BC = ?," +
        "    MA_CT = ?," +
        "    MA_DVQL = ?," +
        "    THANG = ?," +
        "    QUY = ?," +
        "    NAM = ?," +
        "    ST_BHYT_DN = ?," +
        "    ST_BHYT_TD = ?," +
        "    ST_BHYT_CL = ?," +
        "    ST_DP_20_DN = ?," +
        "    ST_DP_20_TD = ?," +
        "    ST_DP_20_CL = ?," +
        "    ST_TONG_SO_DN = ?," +
        "    ST_TONG_SO_TD = ?," +
        "    ST_TONG_SO_CL = ?," +
        "    SO_DN = ?," +
        "    SO_TD = ?," +
        "    TRC_2019_DN = ?," +
        "    TRC_2019_TD = ?," +
        "    TRC_2019_CL = ?," +
        "    NAM_2019_DN = ?," +
        "    NAM_2019_TD = ?," +
        "    NAM_2019_CL = ?," +
        "    TRC_2020_DN = ?," +
        "    TRC_2020_TD = ?," +
        "    TRC_2020_CL = ?," +
        "    IS_BIEUMAU = ?," +
        "    LAN_CHUYEN = ?," +
        "    TRANG_THAI = ?," +
        "    NGUOI_TC = ?," +
        "    NGAY_TC = ?," +
        "    MA_TINH = ?," +
        "    PHAN_MEM = ?," +
        "    PATH_FILE = ?," +
        "    TEN_FILE = ?," +
        "    LY_DO_HUY = ?," +
        "    NGUOI_CHUYEN = ?," +
        "    NGAY_CHUYEN = ?," +
        "    ID_HDR = ?," +
        "    TRANG_THAI_TW = ?," +
        "    MA_CQBH_TD = ?," +
        "    NGUOI_TD = ?," +
        "    NGAY_TD = ?," +
        "    LAN_TD = ?," +
        "    NAM1_DN = ?," +
        "    NAM2_DN = ?," +
        "    NAM3_DN = ?," +
        "    NAM4_DN = ?," +
        "    NAM5_DN = ?," +
        "    NAM6_DN = ?," +
        "    NAM1_TD = ?," +
        "    NAM2_TD = ?," +
        "    NAM3_TD = ?," +
        "    NAM4_TD = ?," +
        "    NAM5_TD = ?," +
        "    NAM6_TD = ?," +
        "    NAM1_CL = ?," +
        "    NAM2_CL = ?," +
        "    NAM3_CL = ?," +
        "    NAM4_CL = ?," +
        "    NAM5_CL = ?," +
        "    NAM6_CL = ?," +
        "    MA_CQBH_TDDV = ?," +
        "    NGUOI_TDDV = ?," +
        "    NGAY_TDDV = ?," +
        "    LYDO_TM = ?," +
        "    LYDO_TMDV = ?" +
        "where id = ? and MA_BC = ?";


    public static final String UPDATE_THAM_DINH_CSXH_DTL  = "UPDATE THAM_DINH_CSXH_DTL " +
        "SET MA_BC=?, " +
        "MA_CT=?, " +
        "MA_DVQL=?, " +
        "THANG=?, " +
        "QUY=?, " +
        "NAM=?, " +
        "SO_DN=?, " +
        "SO_TD=?, " +
        "SO_CL=?, " +
        "LAN_CHUYEN=?, " +
        "TRANG_THAI=?, " +
        "NGUOI_TC=?, " +
        "NGAY_TC=?, " +
        "MA_TINH=?, " +
        "PHAN_MEM=?, " +
        "PATH_FILE=?, " +
        "TEN_FILE=?, " +
        "LY_DO_HUY=?, " +
        "NGUOI_CHUYEN=?, " +
        "NGAY_CHUYEN=?, " +
        "ID_HDR=?, " +
        "TRANG_THAI_TW=?, " +
        "MA_CQBH_TD=?, " +
        "NGUOI_TD=?, " +
        "NGAY_TD=?, " +
        "LAN_TD=?, " +
        "MA_CQBH_TDDV=?, " +
        "NGUOI_TDDV=?, " +
        "NGAY_TDDV=?, " +
        "LYDO_TM=?, " +
        "LYDO_TMDV=?, " +
        "PATH_FILE_LYDOTM=?, " +
        "PATH_FILE_LYDOTM_DV=?, " +
        "NAME_FILE_LYDOTM=?, " +
        "NAME_FILE_LYDOTM_DV=?" +
        "WHERE ID=?";


    public static final String INSERT_THAM_DINH_THUYET_MINH = "INSERT INTO THAM_DINH_TM(" +
        "ID," +
        "MA_DVQL," +
        "MA_BC," +
        "MA_CT," +
        "LAN_CHUYEN," +
        "DOT," +
        "LAN_TD," +
        "ID_DTL," +
        "NGAY_NHAP," +
        "NGUOI_NHAP," +
        "IS_TW," +
        "TEN_FILE," +
        "PATH_FILE," +
        "SIZE_FILE," +
        "NAM," +
        "TEN_FILE_GOC" +
        ")VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";


    public static final String INSERT_TST_PL05_IMPORT = "INSERT INTO TST_PL05_IMPORT(" +
        "ID," +
        "MA_TINH," +
        "NAM," +
        "DOT," +
        "MA_BC," +
        "MA_CT," +
        "MA_SO," +
        "SO_NGUOI," +
        "TONG_SOTHU," +
        "SO_NAMTRC," +
        "SO_NAMNAY," +
        "SO_NAMSAU," +
        "NSNN_HOTRO," +
        "TONGSO_NAMNAY," +
        "TONGSO_NAMSAU," +
        "NGAY_NHAP," +
        "NGUOI_NHAP," +
        "MA_CQBH," +
        "IS_TW," +
        "IS_LOI," +
        "MSG," +
        "ID_REF," +
        "TRANG_THAI" +
        ")VALUES(TST_PL05_IMPORT_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate,?,?,?,?,?,?,?)";

    public static final String INSERT_CSYT_M08_IMPORT = "INSERT INTO GD_CSYT_BC08_IMPORT(" +
        "ID," +
        "MA_TINH," +
        "NAM," +
        "DOT," +
        "MA_CSKCB," +
        "TEN_CSKCB," +
        "TONG_MUC_TT," +
        "SOCHI_KQT," +
        "IS_VPT," +
        "NGAY_NHAP," +
        "NGUOI_NHAP," +
        "MA_CQBH," +
        "IS_TW," +
        "IS_LOI," +
        "MSG," +
        "ID_REF," +
        "TRANG_THAI" +
        ")VALUES(GD_CSYT_BC08_IMPORT_SEQ.nextval,?,?,?,?,?,?,?,?,sysdate,?,?,?,?,?,?,?)";

    public static final String INSERT_TCKT_M04 = "INSERT INTO TCKT_M04(" +
        "ID," +
        "NAM_THANG," +
        "NGAYTHANG_GS," +
        "MA_DVQL," +
        "MA_DL," +
        "MA_NKP," +
        "MA_CD," +
        "SO_HIEU," +
        "NGAY_THANG," +
        "DIEN_GIAI," +
        "NOIDUNG," +
        "DIENGIAI_NKP," +
        "TX," +
        "NS," +
        "N_DAUKY," +
        "N_DAUKY_HH," +
        "T_DAUKY," +
        "N_PHAITRA_PS," +
        "T_PHAITRA_PS," +
        "N_THUCTRA_PS," +
        "T_THUCTRA_PS," +
        "N_LUYKE," +
        "T_LUYKE," +
        "N_KHONGTRA," +
        "T_KHONGTRA," +
        "N_PHAITRA," +
        "T_PHAITRA," +
        "USERNAME," +
        "USERDATE," +
        "MA_BAOCAO," +
        "ID_CHUNGTU," +
        "STT," +
        "MA_NHOM," +
        "TONG_CHUATRA_DK," +
        "N_CHUATRA_DK," +
        "T_CHUATRA_DK," +
        "FONTSTYLE," +
        "NGAY_KT," +
        "MASO," +
        "NAM_THANG_LINE," +
        "MA_DVQL_LINE," +
        "MA_NKP_LINE," +
        "MA_CD_LINE," +
        "N_DAUKY_LINE," +
        "N_DAUKY_HH_LINE," +
        "T_CHUATRA_DK_LINE," +
        "N_KHONGTRA_LINE," +
        "T_KHONGTRA_LINE," +
        "IS_LASTMMONTH," +
        "NAM," +
        "MA_TINH," +
        "ID_TCKT" +
        ")VALUES(TCKT_M04_SEQ.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
}
