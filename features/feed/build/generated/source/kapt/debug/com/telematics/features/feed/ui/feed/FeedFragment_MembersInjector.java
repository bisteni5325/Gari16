// Generated by Dagger (https://dagger.dev).
package com.telematics.features.feed.ui.feed;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FeedFragment_MembersInjector implements MembersInjector<FeedFragment> {
  private final Provider<FeedViewModel> feedViewModelProvider;

  public FeedFragment_MembersInjector(Provider<FeedViewModel> feedViewModelProvider) {
    this.feedViewModelProvider = feedViewModelProvider;
  }

  public static MembersInjector<FeedFragment> create(
      Provider<FeedViewModel> feedViewModelProvider) {
    return new FeedFragment_MembersInjector(feedViewModelProvider);
  }

  @Override
  public void injectMembers(FeedFragment instance) {
    injectFeedViewModel(instance, feedViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.feed.ui.feed.FeedFragment.feedViewModel")
  public static void injectFeedViewModel(FeedFragment instance, FeedViewModel feedViewModel) {
    instance.feedViewModel = feedViewModel;
  }
}
