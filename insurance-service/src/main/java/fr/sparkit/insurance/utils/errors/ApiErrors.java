package fr.sparkit.insurance.utils.errors;

public final class ApiErrors {

    private ApiErrors() {
        super();
    }

    public static final class insurance {
        /* Naming convention : [ENTITY]_[SHORT_DESCRIPTION] */
        /* Generic insurance codes [40000-40099] */
        public static final int ENTITY_NOT_FOUND = 40000;

        /* Organisation codes [40100-40199] */
        public static final int NULL_ORGANISATION_FOUND = 40100;
        public static final int NULL_ORGANISATION_TO_UPDATE_FOUND = 40101;
        public static final int ORGANIZATION_RELATED_TO_CONTACTS = 40102;
        public static final int ORGANIZATION_RELATED_TO_OPPORTUNITY = 40103;


        /* Opportunity codes [40200-40299] */
        public static final int NULL_OPPORTUNITY_FOUND = 40200;
        public static final int OPPORTUNITY_TILE_IS_ALREADY_USED = 40201;

        /* Contact codes [40300-40399] */
        public static final int NULL_CONTACT_INSURANCE_FOUND = 40300;
        public static final int STORE_PICTURE_FAILED = 40301;
        public static final int CREATE_DIRECTORY_FAILED = 40302;
        public static final int EMAIL_IS_ALREADY_USED = 40303;
        public static final int IMPOSSIBLE_TO_DELETE_CONTACT_RELATED_TO_OPP_CLAIM = 40304;
        public static final int IMPOSSIBLE_TO_DELETE_CONTACT_RELATED_TO_OPP = 40305;
        public static final int IMPOSSIBLE_TO_DELETE_CONTACT_RELATED_TO_CLAIM = 40306;

        /* Action codes [40400-40499] */
        public static final int NULL_ACTION_FOUND = 40400;
        public static final int ANOTHER_ACTION_FOUND_WITHIN_THE_SAME_RANGE = 40401;
        /* Claim codes [40500-40599] */
        public static final int CLAIM_NOT_FOUND = 40500;
        /* Status codes [40600-40699] */
        public static final int STATUS_ALREADY_USED_IN_CATEGORY = 40600;
        public static final int NULL_CATEGORY_STATUS_FOUND = 40601;
        public static final int STATUS_TITLE_ALREADY_USED = 40602;
        public static final int STATUS_COLOR_ALREADY_USED = 40603;

        /* Notification codes [40700-40799] */
        public static final int NOTIFICATION_NOT_FOUND = 40700;
        public static final int NOTIFICATION_ALREADY_EXISTS = 40701;

        /* Category codes [40800-40899] */
        public static final int CATEGORY_ALREADY_USED = 40800;
        public static final int NULL_CATEGORY_FOUND = 40801;

        /* Multi Base codes [40900-40999] */
        public static final int INVALID_COMPANY_SPECIFIED_CANT_CONNECT_TO_DATA_SOURCE = 40900;
        public static final int NO_COMPANY_SPECIFIED_CANT_CONNECT_TO_DATA_SOURCE = 40901;
        public static final int EMPTY_COMPANIES_LIST_IN_APPLICATION_PROPERTIES = 40902;

        /* Employee codes [41000-41099] */
        public static final int NULL_EMPLOYEE_FOUND = 41000;

        /* Commercial codes [41100-41199] */
        public static final int NULL_COMMERCIAL_FOUND = 41100;

        /* Fileinsurance codes [41200-41299] */
        public static final int FILE_INSURANCE_NOT_FOUND = 41200;
        public static final int DELETE_FILE_INSURANCE_FAILED = 41201;

        /* Commercial codes [41300-41399] */
        public static final int NULL_PIPELINE_FOUND = 41300;
        public static final int PIPELINE_NAME_IS_ALREADY_USED = 41301;
        /* Phone codes [41400-41499] */
        public static final int NULL_PHONE_FOUND = 41400;
        /* Permission codes [41500-41599] */
        public static final int NULL_PERMISSION = 41500;
        public static final int CANNOT_EDIT_PERMISSION = 41501;
        /* Commercial Details codes [41600-41699] */
        public static final int NULL_COMMERCIAL_DETAILS = 41600;
        /* Reminder  codes [41651-41699] */
        public static final int REMINDER_MAIL_FAILED = 41651;
        public static final int NULL_REMINDER_FOUND = 41652;

        /* Reminder  codes [41700-41799] */
        public static final int NOTE_NOT_FOUND = 41701;

        /* Marking events items [41800-41899] */
        public static final int ITEM_NAME_ALREADY_USED = 41801;

        private insurance() {
            super();
        }
    }

}
