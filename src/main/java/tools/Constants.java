package tools;

public final class Constants {
	//USERS
	public static final String DM_USER = "holaszkati@ymail.com";
	public static final String DM_PASSWORD = "kati";
	
	public static final String SIMPLE_USER = "";
	public static final String SIMPLE_USER_PASSWORD = "";
	
	public static final String VACATION_APPROVER = "";
	public static final String VACATION_APPROVER_PASSWORD = "";
	
	//URLs
	public static final String ADD_USER_URL = "http://localhost:9090/group/control_panel/manage?p_p_id=125&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&doAsGroupId=10561&refererPlid=10621&_125_struts_action=%2Fusers_admin%2Fedit_user&_125_redirect=http%3A%2F%2Flocalhost%3A9090%2Fgroup%2Fcontrol_panel%2Fmanage%3Fp_p_id%3D125%26p_p_lifecycle%3D0%26p_p_state%3Dmaximized%26p_p_mode%3Dview%26doAsGroupId%3D10561%26refererPlid%3D10621%26_125_struts_action%3D%252Fusers_admin%252Fview%26_125_usersListView%3Dtree%26_125_saveUsersListView%3Dtrue";
	public static final String PROCESSES_URL = "";
	public static final String ADD_PASS_URL = "http://localhost:9090/group/control_panel/manage?p_p_id=125&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&doAsGroupId=10561&refererPlid=10621&_125_struts_action=%2Fusers_admin%2Fedit_user&_125_redirect=http%3A%2F%2Flocalhost%3A9090%2Fgroup%2Fcontrol_panel%2Fmanage%3Fp_p_id%3D125%26p_p_lifecycle%3D0%26p_p_state%3Dmaximized%26p_p_mode%3Dview%26doAsGroupId%3D10561%26refererPlid%3D10621%26_125_refererPlid%3D10621%26_125_doAsGroupId%3D10561%26_125_cur1%3D1%26_125_delta1%3D20%26_125_keywords%3D%26_125_advancedSearch%3Dfalse%26_125_andOperator%3Dtrue%26_125_city%3D%26_125_countryId%3D0%26_125_name%3D%26_125_parentOrganizationId%3D0%26_125_regionId%3D0%26_125_street%3D%26_125_zip%3D%26_125_orderByCol%3Dlast-name%26_125_orderByType%3Dasc%26_125_resetCur%3Dfalse%26_125_cur2%3D1%26_125_delta2%3D20%26_125_status%3D0%26_125_emailAddress%3D%26_125_firstName%3D%26_125_lastName%3D%26_125_middleName%3D%26_125_organizationId%3D0%26_125_roleId%3D0%26_125_screenName%3D%26_125_userGroupId%3D0&_125_p_u_i_d=79532#_LFR_FN__125_password";
	public static final String ADD_SITES_URL = "http://localhost:9090/group/control_panel/manage?p_p_id=125&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&doAsGroupId=10561&refererPlid=10621&_125_struts_action=%2Fusers_admin%2Fedit_user&_125_redirect=http%3A%2F%2Flocalhost%3A9090%2Fgroup%2Fcontrol_panel%2Fmanage%3Fp_p_id%3D125%26p_p_lifecycle%3D0%26p_p_state%3Dmaximized%26p_p_mode%3Dview%26doAsGroupId%3D10561%26refererPlid%3D10621%26_125_refererPlid%3D10621%26_125_doAsGroupId%3D10561%26_125_cur1%3D1%26_125_delta1%3D20%26_125_keywords%3D%26_125_advancedSearch%3Dfalse%26_125_andOperator%3Dtrue%26_125_city%3D%26_125_countryId%3D0%26_125_name%3D%26_125_parentOrganizationId%3D0%26_125_regionId%3D0%26_125_street%3D%26_125_zip%3D%26_125_orderByCol%3Dlast-name%26_125_orderByType%3Dasc%26_125_resetCur%3Dfalse%26_125_cur2%3D1%26_125_delta2%3D20%26_125_status%3D0%26_125_emailAddress%3D%26_125_firstName%3D%26_125_lastName%3D%26_125_middleName%3D%26_125_organizationId%3D0%26_125_roleId%3D0%26_125_screenName%3D%26_125_userGroupId%3D0&_125_p_u_i_d=79532#_LFR_FN__125_sites";
	public static final String ADD_ROLES_URL = "http://localhost:9090/group/control_panel/manage?p_p_id=125&p_p_lifecycle=0&p_p_state=pop_up&p_p_mode=view&doAsGroupId=10561&refererPlid=10621&_125_struts_action=%2Fusers_admin%2Fselect_site";
			
	//CREATE NEW USER
	public static final String NU_SCREEN_NAME = tools.GenerateRandomUserName.generateRandomString() ;
	public static final String NU_EMAIL = "holaszkati@gmail.com";
	public static final String NU_F_NAME = "User";
	public static final String NU_L_NAME = "Random";
	public static final String NU_PERS_ID = "123456";
	public static final String NU_BIRTH_PLACE = "Cluj";
	public static final String NU_PASSWORD = "1234";
	public static final String NU_ANSWER_TO_PASSWORD_REMINDER= "1234";
	
	// EVO Cancel Vacation - Dates to be used
	public static final String S_MONTH_ECV = "December";
	public static final String S_DAY_ECV = "21";
	public static final String S_YEAR_ECV = "2013";
	public static final String E_MONTH_ECV = "December";
	public static final String E_DAY_ECV= "22";
	public static final String E_YEAR_ECV = "2013";
	
	// EVO CANCEL VACATION HISTORY 
	public static final String FIRST_NAME_EVH = "Holasz";
	public static final String LAST_NAME_EVH = "kati";
	public static final String DAY_COUNT_EVH = "2";
	public static final String VACATION_TYPE_EVH = "odihna";
	
	//MY FREE DAYS
	public static final String FREE_CURRENT_YEAR = "11";
	public static final String FREE_LAST_YEAR = "1";
	public static final String MONTHS_EXP_BEFORE_HIRING = "0";
	public static final String MONTHS_EXP_EVOZON = "1";
	
	public static final String FREE_CURRENT_YEAR_1 = "0";
	public static final String FREE_LAST_YEAR_1 = "0";
	public static final String MONTHS_EXP_BEFORE_HIRING_1 = "0";
	public static final String MONTHS_EXP_EVOZON_1 = "12";
	
	public static final String FREE_CURRENT_YEAR_2 = "123577";
	public static final String FREE_LAST_YEAR_2 = "88686";
	public static final String MONTHS_EXP_BEFORE_HIRING_2 = "784563";
	public static final String MONTHS_EXP_EVOZON_2 = "78686488";
	
	//NEW VACATION REQUEST - DATES 
	public static final String START_MONTH_NVR = "December";
	public static final String START_DAY_NVR = "23";
	public static final String START_YEAR_NVR = "2013";
	public static final String END_MONTH_NVR = "December";
	public static final String END_DAY_NVR = "23";
	public static final String END_YEAR_NVR = "2013";
	
	public static final String START_MONTH_NVR_1 = "";
	public static final String START_DAY_NVR_1 = "";
	public static final String START_YEAR_NVR_1 = "";
	public static final String END_MONTH_NVR_1 = "";
	public static final String END_DAY_NVR_1 = "";
	public static final String END_YEAR_NVR_1 = "";
	
	// CREATE NEW VACATION REQUEST - dynamic dates (for loop) - FOR JANUARY 2014
	public static final int START_DAY = 6;
	public static final int NUMBER_OF_VACATION_REQUESTS_TO_SUBMIT = 6;


	


}
