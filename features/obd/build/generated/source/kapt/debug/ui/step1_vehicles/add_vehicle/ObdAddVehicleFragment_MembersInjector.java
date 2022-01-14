// Generated by Dagger (https://dagger.dev).
package ui.step1_vehicles.add_vehicle;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ObdAddVehicleFragment_MembersInjector implements MembersInjector<ObdAddVehicleFragment> {
  private final Provider<VehicleViewModel> vehicleViewModelProvider;

  public ObdAddVehicleFragment_MembersInjector(
      Provider<VehicleViewModel> vehicleViewModelProvider) {
    this.vehicleViewModelProvider = vehicleViewModelProvider;
  }

  public static MembersInjector<ObdAddVehicleFragment> create(
      Provider<VehicleViewModel> vehicleViewModelProvider) {
    return new ObdAddVehicleFragment_MembersInjector(vehicleViewModelProvider);
  }

  @Override
  public void injectMembers(ObdAddVehicleFragment instance) {
    injectVehicleViewModel(instance, vehicleViewModelProvider.get());
  }

  @InjectedFieldSignature("ui.step1_vehicles.add_vehicle.ObdAddVehicleFragment.vehicleViewModel")
  public static void injectVehicleViewModel(ObdAddVehicleFragment instance,
      VehicleViewModel vehicleViewModel) {
    instance.vehicleViewModel = vehicleViewModel;
  }
}
