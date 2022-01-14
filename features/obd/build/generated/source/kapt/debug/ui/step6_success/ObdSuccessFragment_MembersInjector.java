// Generated by Dagger (https://dagger.dev).
package ui.step6_success;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import ui.ObdViewModel;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ObdSuccessFragment_MembersInjector implements MembersInjector<ObdSuccessFragment> {
  private final Provider<ObdViewModel> obdViewModelProvider;

  public ObdSuccessFragment_MembersInjector(Provider<ObdViewModel> obdViewModelProvider) {
    this.obdViewModelProvider = obdViewModelProvider;
  }

  public static MembersInjector<ObdSuccessFragment> create(
      Provider<ObdViewModel> obdViewModelProvider) {
    return new ObdSuccessFragment_MembersInjector(obdViewModelProvider);
  }

  @Override
  public void injectMembers(ObdSuccessFragment instance) {
    injectObdViewModel(instance, obdViewModelProvider.get());
  }

  @InjectedFieldSignature("ui.step6_success.ObdSuccessFragment.obdViewModel")
  public static void injectObdViewModel(ObdSuccessFragment instance, ObdViewModel obdViewModel) {
    instance.obdViewModel = obdViewModel;
  }
}
