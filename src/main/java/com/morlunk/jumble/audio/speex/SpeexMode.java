/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.morlunk.jumble.audio.speex;

public class SpeexMode {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SpeexMode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SpeexMode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        SpeexJNI.delete_SpeexMode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMode(SWIGTYPE_p_void value) {
    SpeexJNI.SpeexMode_mode_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getMode() {
    long cPtr = SpeexJNI.SpeexMode_mode_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setQuery(SWIGTYPE_p_f_p_q_const__void_int_p_void__int value) {
    SpeexJNI.SpeexMode_query_set(swigCPtr, this, SWIGTYPE_p_f_p_q_const__void_int_p_void__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_q_const__void_int_p_void__int getQuery() {
    long cPtr = SpeexJNI.SpeexMode_query_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__void_int_p_void__int(cPtr, false);
  }

  public void setModeName(byte[] value) {
    SpeexJNI.SpeexMode_modeName_set(swigCPtr, this, value);
  }

  public byte[] getModeName() {
    return SpeexJNI.SpeexMode_modeName_get(swigCPtr, this);
  }

  public void setModeID(int value) {
    SpeexJNI.SpeexMode_modeID_set(swigCPtr, this, value);
  }

  public int getModeID() {
    return SpeexJNI.SpeexMode_modeID_get(swigCPtr, this);
  }

  public void setBitstream_version(int value) {
    SpeexJNI.SpeexMode_bitstream_version_set(swigCPtr, this, value);
  }

  public int getBitstream_version() {
    return SpeexJNI.SpeexMode_bitstream_version_get(swigCPtr, this);
  }

  public void setEnc_init(SWIGTYPE_p_f_p_q_const__struct_SpeexMode__p_void value) {
    SpeexJNI.SpeexMode_enc_init_set(swigCPtr, this, SWIGTYPE_p_f_p_q_const__struct_SpeexMode__p_void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_q_const__struct_SpeexMode__p_void getEnc_init() {
    long cPtr = SpeexJNI.SpeexMode_enc_init_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__struct_SpeexMode__p_void(cPtr, false);
  }

  public void setEnc_destroy(SWIGTYPE_p_f_p_void__void value) {
    SpeexJNI.SpeexMode_enc_destroy_set(swigCPtr, this, SWIGTYPE_p_f_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void__void getEnc_destroy() {
    long cPtr = SpeexJNI.SpeexMode_enc_destroy_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void__void(cPtr, false);
  }

  public void setEnc(SWIGTYPE_p_f_p_void_p_void_p_struct_SpeexBits__int value) {
    SpeexJNI.SpeexMode_enc_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_void_p_struct_SpeexBits__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_void_p_struct_SpeexBits__int getEnc() {
    long cPtr = SpeexJNI.SpeexMode_enc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_void_p_struct_SpeexBits__int(cPtr, false);
  }

  public void setDec_init(SWIGTYPE_p_f_p_q_const__struct_SpeexMode__p_void value) {
    SpeexJNI.SpeexMode_dec_init_set(swigCPtr, this, SWIGTYPE_p_f_p_q_const__struct_SpeexMode__p_void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_q_const__struct_SpeexMode__p_void getDec_init() {
    long cPtr = SpeexJNI.SpeexMode_dec_init_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__struct_SpeexMode__p_void(cPtr, false);
  }

  public void setDec_destroy(SWIGTYPE_p_f_p_void__void value) {
    SpeexJNI.SpeexMode_dec_destroy_set(swigCPtr, this, SWIGTYPE_p_f_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void__void getDec_destroy() {
    long cPtr = SpeexJNI.SpeexMode_dec_destroy_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void__void(cPtr, false);
  }

  public void setDec(SWIGTYPE_p_f_p_void_p_struct_SpeexBits_p_void__int value) {
    SpeexJNI.SpeexMode_dec_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_struct_SpeexBits_p_void__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_struct_SpeexBits_p_void__int getDec() {
    long cPtr = SpeexJNI.SpeexMode_dec_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_struct_SpeexBits_p_void__int(cPtr, false);
  }

  public void setEnc_ctl(SWIGTYPE_p_f_p_void_int_p_void__int value) {
    SpeexJNI.SpeexMode_enc_ctl_set(swigCPtr, this, SWIGTYPE_p_f_p_void_int_p_void__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_int_p_void__int getEnc_ctl() {
    long cPtr = SpeexJNI.SpeexMode_enc_ctl_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_int_p_void__int(cPtr, false);
  }

  public void setDec_ctl(SWIGTYPE_p_f_p_void_int_p_void__int value) {
    SpeexJNI.SpeexMode_dec_ctl_set(swigCPtr, this, SWIGTYPE_p_f_p_void_int_p_void__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_int_p_void__int getDec_ctl() {
    long cPtr = SpeexJNI.SpeexMode_dec_ctl_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_int_p_void__int(cPtr, false);
  }

  public SpeexMode() {
    this(SpeexJNI.new_SpeexMode(), true);
  }

}