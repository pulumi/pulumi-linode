# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AccountSettingsArgs', 'AccountSettings']

@pulumi.input_type
class AccountSettingsArgs:
    def __init__(__self__, *,
                 backups_enabled: Optional[pulumi.Input[bool]] = None,
                 longview_subscription: Optional[pulumi.Input[str]] = None,
                 network_helper: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a AccountSettings resource.
        :param pulumi.Input[bool] backups_enabled: The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
        :param pulumi.Input[str] longview_subscription: The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
        :param pulumi.Input[bool] network_helper: Enables network helper across all users by default for new Linodes and Linode Configs.
        """
        if backups_enabled is not None:
            pulumi.set(__self__, "backups_enabled", backups_enabled)
        if longview_subscription is not None:
            pulumi.set(__self__, "longview_subscription", longview_subscription)
        if network_helper is not None:
            pulumi.set(__self__, "network_helper", network_helper)

    @property
    @pulumi.getter(name="backupsEnabled")
    def backups_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
        """
        return pulumi.get(self, "backups_enabled")

    @backups_enabled.setter
    def backups_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "backups_enabled", value)

    @property
    @pulumi.getter(name="longviewSubscription")
    def longview_subscription(self) -> Optional[pulumi.Input[str]]:
        """
        The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
        """
        return pulumi.get(self, "longview_subscription")

    @longview_subscription.setter
    def longview_subscription(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "longview_subscription", value)

    @property
    @pulumi.getter(name="networkHelper")
    def network_helper(self) -> Optional[pulumi.Input[bool]]:
        """
        Enables network helper across all users by default for new Linodes and Linode Configs.
        """
        return pulumi.get(self, "network_helper")

    @network_helper.setter
    def network_helper(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "network_helper", value)


@pulumi.input_type
class _AccountSettingsState:
    def __init__(__self__, *,
                 backups_enabled: Optional[pulumi.Input[bool]] = None,
                 longview_subscription: Optional[pulumi.Input[str]] = None,
                 managed: Optional[pulumi.Input[bool]] = None,
                 network_helper: Optional[pulumi.Input[bool]] = None,
                 object_storage: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccountSettings resources.
        :param pulumi.Input[bool] backups_enabled: The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
        :param pulumi.Input[str] longview_subscription: The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
        :param pulumi.Input[bool] managed: Enables monitoring for connectivity, response, and total request time.
        :param pulumi.Input[bool] network_helper: Enables network helper across all users by default for new Linodes and Linode Configs.
        :param pulumi.Input[str] object_storage: A string describing the status of this account's Object Storage service enrollment.
        """
        if backups_enabled is not None:
            pulumi.set(__self__, "backups_enabled", backups_enabled)
        if longview_subscription is not None:
            pulumi.set(__self__, "longview_subscription", longview_subscription)
        if managed is not None:
            pulumi.set(__self__, "managed", managed)
        if network_helper is not None:
            pulumi.set(__self__, "network_helper", network_helper)
        if object_storage is not None:
            pulumi.set(__self__, "object_storage", object_storage)

    @property
    @pulumi.getter(name="backupsEnabled")
    def backups_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
        """
        return pulumi.get(self, "backups_enabled")

    @backups_enabled.setter
    def backups_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "backups_enabled", value)

    @property
    @pulumi.getter(name="longviewSubscription")
    def longview_subscription(self) -> Optional[pulumi.Input[str]]:
        """
        The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
        """
        return pulumi.get(self, "longview_subscription")

    @longview_subscription.setter
    def longview_subscription(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "longview_subscription", value)

    @property
    @pulumi.getter
    def managed(self) -> Optional[pulumi.Input[bool]]:
        """
        Enables monitoring for connectivity, response, and total request time.
        """
        return pulumi.get(self, "managed")

    @managed.setter
    def managed(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "managed", value)

    @property
    @pulumi.getter(name="networkHelper")
    def network_helper(self) -> Optional[pulumi.Input[bool]]:
        """
        Enables network helper across all users by default for new Linodes and Linode Configs.
        """
        return pulumi.get(self, "network_helper")

    @network_helper.setter
    def network_helper(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "network_helper", value)

    @property
    @pulumi.getter(name="objectStorage")
    def object_storage(self) -> Optional[pulumi.Input[str]]:
        """
        A string describing the status of this account's Object Storage service enrollment.
        """
        return pulumi.get(self, "object_storage")

    @object_storage.setter
    def object_storage(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "object_storage", value)


class AccountSettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backups_enabled: Optional[pulumi.Input[bool]] = None,
                 longview_subscription: Optional[pulumi.Input[str]] = None,
                 network_helper: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Manages the settings of a Linode account.

        ## Example Usage

        The following example shows how one might use this resource to change their Linode account settings.

        ```python
        import pulumi
        import pulumi_linode as linode

        myaccount = linode.AccountSettings("myaccount",
            backups_enabled=True,
            longview_subscription="longview-40")
        ```

        ## Additional Results

        * `managed` - Enables monitoring for connectivity, response, and total request time.

        * `object_storage` - A string describing the status of this account’s Object Storage service enrollment.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] backups_enabled: The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
        :param pulumi.Input[str] longview_subscription: The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
        :param pulumi.Input[bool] network_helper: Enables network helper across all users by default for new Linodes and Linode Configs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AccountSettingsArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages the settings of a Linode account.

        ## Example Usage

        The following example shows how one might use this resource to change their Linode account settings.

        ```python
        import pulumi
        import pulumi_linode as linode

        myaccount = linode.AccountSettings("myaccount",
            backups_enabled=True,
            longview_subscription="longview-40")
        ```

        ## Additional Results

        * `managed` - Enables monitoring for connectivity, response, and total request time.

        * `object_storage` - A string describing the status of this account’s Object Storage service enrollment.

        :param str resource_name: The name of the resource.
        :param AccountSettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountSettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backups_enabled: Optional[pulumi.Input[bool]] = None,
                 longview_subscription: Optional[pulumi.Input[str]] = None,
                 network_helper: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountSettingsArgs.__new__(AccountSettingsArgs)

            __props__.__dict__["backups_enabled"] = backups_enabled
            __props__.__dict__["longview_subscription"] = longview_subscription
            __props__.__dict__["network_helper"] = network_helper
            __props__.__dict__["managed"] = None
            __props__.__dict__["object_storage"] = None
        super(AccountSettings, __self__).__init__(
            'linode:index/accountSettings:AccountSettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backups_enabled: Optional[pulumi.Input[bool]] = None,
            longview_subscription: Optional[pulumi.Input[str]] = None,
            managed: Optional[pulumi.Input[bool]] = None,
            network_helper: Optional[pulumi.Input[bool]] = None,
            object_storage: Optional[pulumi.Input[str]] = None) -> 'AccountSettings':
        """
        Get an existing AccountSettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] backups_enabled: The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
        :param pulumi.Input[str] longview_subscription: The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
        :param pulumi.Input[bool] managed: Enables monitoring for connectivity, response, and total request time.
        :param pulumi.Input[bool] network_helper: Enables network helper across all users by default for new Linodes and Linode Configs.
        :param pulumi.Input[str] object_storage: A string describing the status of this account's Object Storage service enrollment.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountSettingsState.__new__(_AccountSettingsState)

        __props__.__dict__["backups_enabled"] = backups_enabled
        __props__.__dict__["longview_subscription"] = longview_subscription
        __props__.__dict__["managed"] = managed
        __props__.__dict__["network_helper"] = network_helper
        __props__.__dict__["object_storage"] = object_storage
        return AccountSettings(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backupsEnabled")
    def backups_enabled(self) -> pulumi.Output[bool]:
        """
        The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
        """
        return pulumi.get(self, "backups_enabled")

    @property
    @pulumi.getter(name="longviewSubscription")
    def longview_subscription(self) -> pulumi.Output[str]:
        """
        The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
        """
        return pulumi.get(self, "longview_subscription")

    @property
    @pulumi.getter
    def managed(self) -> pulumi.Output[bool]:
        """
        Enables monitoring for connectivity, response, and total request time.
        """
        return pulumi.get(self, "managed")

    @property
    @pulumi.getter(name="networkHelper")
    def network_helper(self) -> pulumi.Output[bool]:
        """
        Enables network helper across all users by default for new Linodes and Linode Configs.
        """
        return pulumi.get(self, "network_helper")

    @property
    @pulumi.getter(name="objectStorage")
    def object_storage(self) -> pulumi.Output[str]:
        """
        A string describing the status of this account's Object Storage service enrollment.
        """
        return pulumi.get(self, "object_storage")

