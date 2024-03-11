# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAccountSettingsResult',
    'AwaitableGetAccountSettingsResult',
    'get_account_settings',
    'get_account_settings_output',
]

@pulumi.output_type
class GetAccountSettingsResult:
    """
    A collection of values returned by getAccountSettings.
    """
    def __init__(__self__, backups_enabled=None, id=None, longview_subscription=None, managed=None, network_helper=None, object_storage=None):
        if backups_enabled and not isinstance(backups_enabled, bool):
            raise TypeError("Expected argument 'backups_enabled' to be a bool")
        pulumi.set(__self__, "backups_enabled", backups_enabled)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if longview_subscription and not isinstance(longview_subscription, str):
            raise TypeError("Expected argument 'longview_subscription' to be a str")
        pulumi.set(__self__, "longview_subscription", longview_subscription)
        if managed and not isinstance(managed, bool):
            raise TypeError("Expected argument 'managed' to be a bool")
        pulumi.set(__self__, "managed", managed)
        if network_helper and not isinstance(network_helper, bool):
            raise TypeError("Expected argument 'network_helper' to be a bool")
        pulumi.set(__self__, "network_helper", network_helper)
        if object_storage and not isinstance(object_storage, str):
            raise TypeError("Expected argument 'object_storage' to be a str")
        pulumi.set(__self__, "object_storage", object_storage)

    @property
    @pulumi.getter(name="backupsEnabled")
    def backups_enabled(self) -> bool:
        """
        Account-wide backups default.
        """
        return pulumi.get(self, "backups_enabled")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="longviewSubscription")
    def longview_subscription(self) -> str:
        """
        The Longview Pro tier you are currently subscribed to.
        """
        return pulumi.get(self, "longview_subscription")

    @property
    @pulumi.getter
    def managed(self) -> bool:
        """
        Enables monitoring for connectivity, response, and total request time.
        """
        return pulumi.get(self, "managed")

    @property
    @pulumi.getter(name="networkHelper")
    def network_helper(self) -> bool:
        """
        Enables network helper across all users by default for new Linodes and Linode Configs.
        """
        return pulumi.get(self, "network_helper")

    @property
    @pulumi.getter(name="objectStorage")
    def object_storage(self) -> str:
        """
        A string describing the status of this account’s Object Storage service enrollment.
        """
        return pulumi.get(self, "object_storage")


class AwaitableGetAccountSettingsResult(GetAccountSettingsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountSettingsResult(
            backups_enabled=self.backups_enabled,
            id=self.id,
            longview_subscription=self.longview_subscription,
            managed=self.managed,
            network_helper=self.network_helper,
            object_storage=self.object_storage)


def get_account_settings(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountSettingsResult:
    """
    Provides information about Linode account settings.

    ## Example Usage

    The following example shows how one might use this data source to access information about Linode account settings.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_linode as linode

    example = linode.get_account_settings()
    ```
    <!--End PulumiCodeChooser -->
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getAccountSettings:getAccountSettings', __args__, opts=opts, typ=GetAccountSettingsResult).value

    return AwaitableGetAccountSettingsResult(
        backups_enabled=pulumi.get(__ret__, 'backups_enabled'),
        id=pulumi.get(__ret__, 'id'),
        longview_subscription=pulumi.get(__ret__, 'longview_subscription'),
        managed=pulumi.get(__ret__, 'managed'),
        network_helper=pulumi.get(__ret__, 'network_helper'),
        object_storage=pulumi.get(__ret__, 'object_storage'))


@_utilities.lift_output_func(get_account_settings)
def get_account_settings_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccountSettingsResult]:
    """
    Provides information about Linode account settings.

    ## Example Usage

    The following example shows how one might use this data source to access information about Linode account settings.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_linode as linode

    example = linode.get_account_settings()
    ```
    <!--End PulumiCodeChooser -->
    """
    ...
