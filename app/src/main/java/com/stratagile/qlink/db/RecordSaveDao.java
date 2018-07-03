package com.stratagile.qlink.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RECORD_SAVE".
*/
public class RecordSaveDao extends AbstractDao<RecordSave, Long> {

    public static final String TABLENAME = "RECORD_SAVE";

    /**
     * Properties of entity RecordSave.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property RecordId = new Property(1, String.class, "recordId", false, "RECORD_ID");
        public final static Property AddressFrom = new Property(2, String.class, "addressFrom", false, "ADDRESS_FROM");
        public final static Property AddressTo = new Property(3, String.class, "addressTo", false, "ADDRESS_TO");
        public final static Property FromP2pId = new Property(4, String.class, "fromP2pId", false, "FROM_P2P_ID");
        public final static Property ToP2pId = new Property(5, String.class, "toP2pId", false, "TO_P2P_ID");
        public final static Property Qlc = new Property(6, float.class, "qlc", false, "QLC");
        public final static Property Ssid = new Property(7, String.class, "ssid", false, "SSID");
        public final static Property RecordType = new Property(8, int.class, "recordType", false, "RECORD_TYPE");
        public final static Property QlcTotal = new Property(9, String.class, "qlcTotal", false, "QLC_TOTAL");
        public final static Property ServiceType = new Property(10, int.class, "serviceType", false, "SERVICE_TYPE");
        public final static Property StartTimeMillins = new Property(11, long.class, "startTimeMillins", false, "START_TIME_MILLINS");
        public final static Property UserFlow = new Property(12, String.class, "userFlow", false, "USER_FLOW");
    }


    public RecordSaveDao(DaoConfig config) {
        super(config);
    }
    
    public RecordSaveDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RECORD_SAVE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"RECORD_ID\" TEXT," + // 1: recordId
                "\"ADDRESS_FROM\" TEXT," + // 2: addressFrom
                "\"ADDRESS_TO\" TEXT," + // 3: addressTo
                "\"FROM_P2P_ID\" TEXT," + // 4: fromP2pId
                "\"TO_P2P_ID\" TEXT," + // 5: toP2pId
                "\"QLC\" REAL NOT NULL ," + // 6: qlc
                "\"SSID\" TEXT," + // 7: ssid
                "\"RECORD_TYPE\" INTEGER NOT NULL ," + // 8: recordType
                "\"QLC_TOTAL\" TEXT," + // 9: qlcTotal
                "\"SERVICE_TYPE\" INTEGER NOT NULL ," + // 10: serviceType
                "\"START_TIME_MILLINS\" INTEGER NOT NULL ," + // 11: startTimeMillins
                "\"USER_FLOW\" TEXT);"); // 12: userFlow
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RECORD_SAVE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, RecordSave entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String recordId = entity.getRecordId();
        if (recordId != null) {
            stmt.bindString(2, recordId);
        }
 
        String addressFrom = entity.getAddressFrom();
        if (addressFrom != null) {
            stmt.bindString(3, addressFrom);
        }
 
        String addressTo = entity.getAddressTo();
        if (addressTo != null) {
            stmt.bindString(4, addressTo);
        }
 
        String fromP2pId = entity.getFromP2pId();
        if (fromP2pId != null) {
            stmt.bindString(5, fromP2pId);
        }
 
        String toP2pId = entity.getToP2pId();
        if (toP2pId != null) {
            stmt.bindString(6, toP2pId);
        }
        stmt.bindDouble(7, entity.getQlc());
 
        String ssid = entity.getSsid();
        if (ssid != null) {
            stmt.bindString(8, ssid);
        }
        stmt.bindLong(9, entity.getRecordType());
 
        String qlcTotal = entity.getQlcTotal();
        if (qlcTotal != null) {
            stmt.bindString(10, qlcTotal);
        }
        stmt.bindLong(11, entity.getServiceType());
        stmt.bindLong(12, entity.getStartTimeMillins());
 
        String userFlow = entity.getUserFlow();
        if (userFlow != null) {
            stmt.bindString(13, userFlow);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, RecordSave entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String recordId = entity.getRecordId();
        if (recordId != null) {
            stmt.bindString(2, recordId);
        }
 
        String addressFrom = entity.getAddressFrom();
        if (addressFrom != null) {
            stmt.bindString(3, addressFrom);
        }
 
        String addressTo = entity.getAddressTo();
        if (addressTo != null) {
            stmt.bindString(4, addressTo);
        }
 
        String fromP2pId = entity.getFromP2pId();
        if (fromP2pId != null) {
            stmt.bindString(5, fromP2pId);
        }
 
        String toP2pId = entity.getToP2pId();
        if (toP2pId != null) {
            stmt.bindString(6, toP2pId);
        }
        stmt.bindDouble(7, entity.getQlc());
 
        String ssid = entity.getSsid();
        if (ssid != null) {
            stmt.bindString(8, ssid);
        }
        stmt.bindLong(9, entity.getRecordType());
 
        String qlcTotal = entity.getQlcTotal();
        if (qlcTotal != null) {
            stmt.bindString(10, qlcTotal);
        }
        stmt.bindLong(11, entity.getServiceType());
        stmt.bindLong(12, entity.getStartTimeMillins());
 
        String userFlow = entity.getUserFlow();
        if (userFlow != null) {
            stmt.bindString(13, userFlow);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public RecordSave readEntity(Cursor cursor, int offset) {
        RecordSave entity = new RecordSave( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // recordId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // addressFrom
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // addressTo
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // fromP2pId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // toP2pId
            cursor.getFloat(offset + 6), // qlc
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // ssid
            cursor.getInt(offset + 8), // recordType
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // qlcTotal
            cursor.getInt(offset + 10), // serviceType
            cursor.getLong(offset + 11), // startTimeMillins
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // userFlow
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, RecordSave entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setRecordId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAddressFrom(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAddressTo(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFromP2pId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setToP2pId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setQlc(cursor.getFloat(offset + 6));
        entity.setSsid(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRecordType(cursor.getInt(offset + 8));
        entity.setQlcTotal(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setServiceType(cursor.getInt(offset + 10));
        entity.setStartTimeMillins(cursor.getLong(offset + 11));
        entity.setUserFlow(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(RecordSave entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(RecordSave entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(RecordSave entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}