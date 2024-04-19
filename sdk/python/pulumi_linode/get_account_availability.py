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
    'GetAccountAvailabilityResult',
    'AwaitableGetAccountAvailabilityResult',
    'get_account_availability',
    'get_account_availability_output',
]

@pulumi.output_type
class GetAccountAvailabilityResult:
    """
    A collection of values returned by getAccountAvailability.
    """
    def __init__(__self__, id=None, region=None, unavailables=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if unavailables and not isinstance(unavailables, list):
            raise TypeError("Expected argument 'unavailables' to be a list")
        pulumi.set(__self__, "unavailables", unavailables)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The region ID.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def unavailables(self) -> Sequence[str]:
        """
        A list of resources which are NOT available to the account in a region.
        """
        return pulumi.get(self, "unavailables")


class AwaitableGetAccountAvailabilityResult(GetAccountAvailabilityResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountAvailabilityResult(
            id=self.id,
            region=self.region,
            unavailables=self.unavailables)


def get_account_availability(region: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountAvailabilityResult:
    """
    Provides details about resource availability in a region to an account specifically.

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode account availability.

    ```python
    import pulumi
    import pulumi_linode as linode

    my_account_availability = linode.get_account_availability(region="us-east")
    ```


    :param str region: The region ID.
    """
    __args__ = dict()
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getAccountAvailability:getAccountAvailability', __args__, opts=opts, typ=GetAccountAvailabilityResult).value

    return AwaitableGetAccountAvailabilityResult(
        id=pulumi.get(__ret__, 'id'),
        region=pulumi.get(__ret__, 'region'),
        unavailables=pulumi.get(__ret__, 'unavailables'))


@_utilities.lift_output_func(get_account_availability)
def get_account_availability_output(region: Optional[pulumi.Input[str]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccountAvailabilityResult]:
    """
    Provides details about resource availability in a region to an account specifically.

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode account availability.

    ```python
    import pulumi
    import pulumi_linode as linode

    my_account_availability = linode.get_account_availability(region="us-east")
    ```


    :param str region: The region ID.
    """
    ...
