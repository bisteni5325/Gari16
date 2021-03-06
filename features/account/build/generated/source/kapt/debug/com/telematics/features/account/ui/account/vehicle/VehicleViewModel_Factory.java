// Generated by Dagger (https://dagger.dev).
package com.telematics.features.account.ui.account.vehicle;

import com.telematics.features.account.use_case.LoginUseCase;
import com.telematics.features.account.use_case.VehicleUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VehicleViewModel_Factory implements Factory<VehicleViewModel> {
  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<VehicleUseCase> vehicleUseCaseProvider;

  public VehicleViewModel_Factory(Provider<LoginUseCase> loginUseCaseProvider,
      Provider<VehicleUseCase> vehicleUseCaseProvider) {
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.vehicleUseCaseProvider = vehicleUseCaseProvider;
  }

  @Override
  public VehicleViewModel get() {
    return newInstance(loginUseCaseProvider.get(), vehicleUseCaseProvider.get());
  }

  public static VehicleViewModel_Factory create(Provider<LoginUseCase> loginUseCaseProvider,
      Provider<VehicleUseCase> vehicleUseCaseProvider) {
    return new VehicleViewModel_Factory(loginUseCaseProvider, vehicleUseCaseProvider);
  }

  public static VehicleViewModel newInstance(LoginUseCase loginUseCase,
      VehicleUseCase vehicleUseCase) {
    return new VehicleViewModel(loginUseCase, vehicleUseCase);
  }
}
