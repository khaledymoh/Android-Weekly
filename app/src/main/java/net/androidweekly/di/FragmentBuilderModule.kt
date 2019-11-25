package net.androidweekly.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import net.androidweekly.advertise.AdvertiseFragment
import net.androidweekly.jobs.JobsFragment
import net.androidweekly.jobs.JobsFragmentModule
import net.androidweekly.latestissue.LatestIssueFragment
import net.androidweekly.latestissue.LatestIssueFragmentModule

/**
 * Project: Android Weekly
 * Created: Oct 20, 2019
 *
 * @author Mohamed Hamdan
 */
@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector(modules = [LatestIssueFragmentModule::class])
    abstract fun bindLatestIssuesFragment(): LatestIssueFragment

    @ContributesAndroidInjector(modules = [JobsFragmentModule::class])
    abstract fun bindJobsFragment(): JobsFragment

    @ContributesAndroidInjector
    abstract fun bindAdvertiseFragment(): AdvertiseFragment
}
