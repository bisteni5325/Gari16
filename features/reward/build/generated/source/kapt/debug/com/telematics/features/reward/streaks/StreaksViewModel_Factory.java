// Generated by Dagger (https://dagger.dev).
package com.telematics.features.reward.streaks;

import com.telematics.domain.repository.RewardRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StreaksViewModel_Factory implements Factory<StreaksViewModel> {
  private final Provider<RewardRepo> rewardRepoProvider;

  public StreaksViewModel_Factory(Provider<RewardRepo> rewardRepoProvider) {
    this.rewardRepoProvider = rewardRepoProvider;
  }

  @Override
  public StreaksViewModel get() {
    return newInstance(rewardRepoProvider.get());
  }

  public static StreaksViewModel_Factory create(Provider<RewardRepo> rewardRepoProvider) {
    return new StreaksViewModel_Factory(rewardRepoProvider);
  }

  public static StreaksViewModel newInstance(RewardRepo rewardRepo) {
    return new StreaksViewModel(rewardRepo);
  }
}
