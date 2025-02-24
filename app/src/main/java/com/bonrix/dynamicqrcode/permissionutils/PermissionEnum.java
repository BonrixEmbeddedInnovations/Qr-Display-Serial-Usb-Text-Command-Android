package com.bonrix.dynamicqrcode.permissionutils;

import android.Manifest;
import android.annotation.SuppressLint;

import androidx.annotation.NonNull;

/**
 * Created by rahul on 22/06/16.
 */
@SuppressLint("InlinedApi")
public enum PermissionEnum {

    BODY_SENSORS(Manifest.permission.BODY_SENSORS),
    READ_CALENDAR(Manifest.permission.READ_CALENDAR),
    WRITE_CALENDAR(Manifest.permission.WRITE_CALENDAR),
    READ_CONTACTS(Manifest.permission.READ_CONTACTS),
    WRITE_CONTACTS(Manifest.permission.WRITE_CONTACTS),
    GET_ACCOUNTS(Manifest.permission.GET_ACCOUNTS),
    READ_EXTERNAL_STORAGE(Manifest.permission.READ_EXTERNAL_STORAGE),
    WRITE_EXTERNAL_STORAGE(Manifest.permission.WRITE_EXTERNAL_STORAGE),
    ACCESS_FINE_LOCATION(Manifest.permission.ACCESS_FINE_LOCATION),
    ACCESS_COARSE_LOCATION(Manifest.permission.ACCESS_COARSE_LOCATION),
    RECORD_AUDIO(Manifest.permission.RECORD_AUDIO),
    READ_PHONE_STATE(Manifest.permission.READ_PHONE_STATE),
    CALL_PHONE(Manifest.permission.CALL_PHONE),
    READ_CALL_LOG(Manifest.permission.READ_CALL_LOG),
    WRITE_CALL_LOG(Manifest.permission.WRITE_CALL_LOG),
    ADD_VOICEMAIL(Manifest.permission.ADD_VOICEMAIL),
    USE_SIP(Manifest.permission.USE_SIP),
    PROCESS_OUTGOING_CALLS(Manifest.permission.PROCESS_OUTGOING_CALLS),
    CAMERA(Manifest.permission.CAMERA),
    SEND_SMS(Manifest.permission.SEND_SMS),
    RECEIVE_SMS(Manifest.permission.RECEIVE_SMS),
    READ_SMS(Manifest.permission.READ_SMS),
    RECEIVE_WAP_PUSH(Manifest.permission.RECEIVE_WAP_PUSH),
    RECEIVE_MMS(Manifest.permission.RECEIVE_MMS);
    private final String permission;

    PermissionEnum(String permission) {
        this.permission = permission;
    }

    public static PermissionEnum fromManifestPermission(@NonNull String value) {
        for (PermissionEnum permissionEnum : PermissionEnum.values()) {
            if (value.equalsIgnoreCase(permissionEnum.permission)) {
                return permissionEnum;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return permission;
    }

}
