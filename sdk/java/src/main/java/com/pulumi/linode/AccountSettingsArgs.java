// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountSettingsArgs Empty = new AccountSettingsArgs();

    /**
     * The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
     * 
     */
    @Import(name="backupsEnabled")
    private @Nullable Output<Boolean> backupsEnabled;

    /**
     * @return The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
     * 
     */
    public Optional<Output<Boolean>> backupsEnabled() {
        return Optional.ofNullable(this.backupsEnabled);
    }

    /**
     * The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
     * 
     */
    @Import(name="longviewSubscription")
    private @Nullable Output<String> longviewSubscription;

    /**
     * @return The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
     * 
     */
    public Optional<Output<String>> longviewSubscription() {
        return Optional.ofNullable(this.longviewSubscription);
    }

    /**
     * Enables network helper across all users by default for new Linodes and Linode Configs.
     * 
     */
    @Import(name="networkHelper")
    private @Nullable Output<Boolean> networkHelper;

    /**
     * @return Enables network helper across all users by default for new Linodes and Linode Configs.
     * 
     */
    public Optional<Output<Boolean>> networkHelper() {
        return Optional.ofNullable(this.networkHelper);
    }

    private AccountSettingsArgs() {}

    private AccountSettingsArgs(AccountSettingsArgs $) {
        this.backupsEnabled = $.backupsEnabled;
        this.longviewSubscription = $.longviewSubscription;
        this.networkHelper = $.networkHelper;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountSettingsArgs $;

        public Builder() {
            $ = new AccountSettingsArgs();
        }

        public Builder(AccountSettingsArgs defaults) {
            $ = new AccountSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupsEnabled The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
         * 
         * @return builder
         * 
         */
        public Builder backupsEnabled(@Nullable Output<Boolean> backupsEnabled) {
            $.backupsEnabled = backupsEnabled;
            return this;
        }

        /**
         * @param backupsEnabled The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
         * 
         * @return builder
         * 
         */
        public Builder backupsEnabled(Boolean backupsEnabled) {
            return backupsEnabled(Output.of(backupsEnabled));
        }

        /**
         * @param longviewSubscription The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
         * 
         * @return builder
         * 
         */
        public Builder longviewSubscription(@Nullable Output<String> longviewSubscription) {
            $.longviewSubscription = longviewSubscription;
            return this;
        }

        /**
         * @param longviewSubscription The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
         * 
         * @return builder
         * 
         */
        public Builder longviewSubscription(String longviewSubscription) {
            return longviewSubscription(Output.of(longviewSubscription));
        }

        /**
         * @param networkHelper Enables network helper across all users by default for new Linodes and Linode Configs.
         * 
         * @return builder
         * 
         */
        public Builder networkHelper(@Nullable Output<Boolean> networkHelper) {
            $.networkHelper = networkHelper;
            return this;
        }

        /**
         * @param networkHelper Enables network helper across all users by default for new Linodes and Linode Configs.
         * 
         * @return builder
         * 
         */
        public Builder networkHelper(Boolean networkHelper) {
            return networkHelper(Output.of(networkHelper));
        }

        public AccountSettingsArgs build() {
            return $;
        }
    }

}
