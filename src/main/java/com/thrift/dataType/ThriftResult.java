/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.thrift.dataType;

public enum ThriftResult implements org.apache.thrift.TEnum {
  SUCCESS(0),
  SERVER_UNWORKING(1),
  NO_CONTENT(2),
  PARAMETER_ERROR(3),
  EXCEPTION(4),
  INDEX_ERROR(5),
  UNKNOWN_ERROR(6),
  DATA_NOT_COMPLETE(7),
  INNER_ERROR(8);

  private final int value;

  private ThriftResult(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftResult findByValue(int value) { 
    switch (value) {
      case 0:
        return SUCCESS;
      case 1:
        return SERVER_UNWORKING;
      case 2:
        return NO_CONTENT;
      case 3:
        return PARAMETER_ERROR;
      case 4:
        return EXCEPTION;
      case 5:
        return INDEX_ERROR;
      case 6:
        return UNKNOWN_ERROR;
      case 7:
        return DATA_NOT_COMPLETE;
      case 8:
        return INNER_ERROR;
      default:
        return null;
    }
  }
}
