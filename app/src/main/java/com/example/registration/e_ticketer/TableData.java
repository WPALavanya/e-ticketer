package com.example.registration.e_ticketer;

/**
 * Created by 3542 on 20/04/2015.
 */
import android.provider.BaseColumns;
public class TableData {
    public TableData(){

    }
    public static abstract class TableInfo implements BaseColumns{
        public static final String USER_NAME = "user_name";
        public static final String FIRST_NAME = "first_name";
        public static final String LAST_NAME = "last_name";
        public static final String NIC = "nic";
        public static final String PASSWORD = "password";
        public static final String DATABASE_NAME = "user_info";
        public static final String TABLE_NAME = "reg_info";
    }
}

