package org.linusu;

import java.security.SecureRandom;

import android.util.Base64;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = RNGetRandomValuesModule.NAME)
public class RNGetRandomValuesModule extends NativeRNGetRandomValuesSpec {
  protected static final String NAME = "RNGetRandomValues";

  public RNGetRandomValuesModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public String getRandomBase64(double byteLength) {
    byte[] data = new byte[(int) byteLength];
    SecureRandom random = new SecureRandom();

    random.nextBytes(data);

    return Base64.encodeToString(data, Base64.NO_WRAP);
  }
}
