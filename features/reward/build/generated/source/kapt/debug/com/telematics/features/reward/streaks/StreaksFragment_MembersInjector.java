// Generated by Dagger (https://dagger.dev).
package com.telematics.features.reward.streaks;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StreaksFragment_MembersInjector implements MembersInjector<StreaksFragment> {
  private final Provider<StreaksViewModel> streaksViewModelProvider;

  public StreaksFragment_MembersInjector(Provider<StreaksViewModel> streaksViewModelProvider) {
    this.streaksViewModelProvider = streaksViewModelProvider;
  }

  public static MembersInjector<StreaksFragment> create(
      Provider<StreaksViewModel> streaksViewModelProvider) {
    return new StreaksFragment_MembersInjector(streaksViewModelProvider);
  }

  @Override
  public void injectMembers(StreaksFragment instance) {
    injectStreaksViewModel(instance, streaksViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.reward.streaks.StreaksFragment.streaksViewModel")
  public static void injectStreaksViewModel(StreaksFragment instance,
      StreaksViewModel streaksViewModel) {
    instance.streaksViewModel = streaksViewModel;
  }
}