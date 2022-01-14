// Generated by Dagger (https://dagger.dev).
package ui;

import com.telematics.data.tracking.TrackingUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import use_case.VehicleUseCase;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ObdViewModel_Factory implements Factory<ObdViewModel> {
  private final Provider<VehicleUseCase> vehicleUseCaseProvider;

  private final Provider<TrackingUseCase> trackingUseCaseProvider;

  public ObdViewModel_Factory(Provider<VehicleUseCase> vehicleUseCaseProvider,
      Provider<TrackingUseCase> trackingUseCaseProvider) {
    this.vehicleUseCaseProvider = vehicleUseCaseProvider;
    this.trackingUseCaseProvider = trackingUseCaseProvider;
  }

  @Override
  public ObdViewModel get() {
    return newInstance(vehicleUseCaseProvider.get(), trackingUseCaseProvider.get());
  }

  public static ObdViewModel_Factory create(Provider<VehicleUseCase> vehicleUseCaseProvider,
      Provider<TrackingUseCase> trackingUseCaseProvider) {
    return new ObdViewModel_Factory(vehicleUseCaseProvider, trackingUseCaseProvider);
  }

  public static ObdViewModel newInstance(VehicleUseCase vehicleUseCase,
      TrackingUseCase trackingUseCase) {
    return new ObdViewModel(vehicleUseCase, trackingUseCase);
  }
}
