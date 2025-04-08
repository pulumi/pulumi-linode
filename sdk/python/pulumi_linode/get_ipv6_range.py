# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = [
    'GetIpv6RangeResult',
    'AwaitableGetIpv6RangeResult',
    'get_ipv6_range',
    'get_ipv6_range_output',
]

@pulumi.output_type
class GetIpv6RangeResult:
    """
    A collection of values returned by getIpv6Range.
    """
    def __init__(__self__, id=None, is_bgp=None, linodes=None, prefix=None, range=None, region=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_bgp and not isinstance(is_bgp, bool):
            raise TypeError("Expected argument 'is_bgp' to be a bool")
        pulumi.set(__self__, "is_bgp", is_bgp)
        if linodes and not isinstance(linodes, list):
            raise TypeError("Expected argument 'linodes' to be a list")
        pulumi.set(__self__, "linodes", linodes)
        if prefix and not isinstance(prefix, int):
            raise TypeError("Expected argument 'prefix' to be a int")
        pulumi.set(__self__, "prefix", prefix)
        if range and not isinstance(range, str):
            raise TypeError("Expected argument 'range' to be a str")
        pulumi.set(__self__, "range", range)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isBgp")
    def is_bgp(self) -> builtins.bool:
        return pulumi.get(self, "is_bgp")

    @property
    @pulumi.getter
    def linodes(self) -> Sequence[builtins.int]:
        """
        A set of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
        """
        return pulumi.get(self, "linodes")

    @property
    @pulumi.getter
    def prefix(self) -> builtins.int:
        """
        The prefix length of the address, denoting how many addresses can be assigned from this range.
        """
        return pulumi.get(self, "prefix")

    @property
    @pulumi.getter
    def range(self) -> builtins.str:
        return pulumi.get(self, "range")

    @property
    @pulumi.getter
    def region(self) -> builtins.str:
        """
        The region for this range of IPv6 addresses.
        """
        return pulumi.get(self, "region")


class AwaitableGetIpv6RangeResult(GetIpv6RangeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIpv6RangeResult(
            id=self.id,
            is_bgp=self.is_bgp,
            linodes=self.linodes,
            prefix=self.prefix,
            range=self.range,
            region=self.region)


def get_ipv6_range(range: Optional[builtins.str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIpv6RangeResult:
    """
    Provides information about a Linode IPv6 Range.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ipv6-range).

    ## Example Usage

    Get information about an IPv6 range assigned to a Linode:

    ```python
    import pulumi
    import pulumi_linode as linode

    range_info = linode.get_ipv6_range(range="2001:0db8::")
    ```


    :param builtins.str range: The IPv6 range to retrieve information about.
    """
    __args__ = dict()
    __args__['range'] = range
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getIpv6Range:getIpv6Range', __args__, opts=opts, typ=GetIpv6RangeResult).value

    return AwaitableGetIpv6RangeResult(
        id=pulumi.get(__ret__, 'id'),
        is_bgp=pulumi.get(__ret__, 'is_bgp'),
        linodes=pulumi.get(__ret__, 'linodes'),
        prefix=pulumi.get(__ret__, 'prefix'),
        range=pulumi.get(__ret__, 'range'),
        region=pulumi.get(__ret__, 'region'))
def get_ipv6_range_output(range: Optional[pulumi.Input[builtins.str]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIpv6RangeResult]:
    """
    Provides information about a Linode IPv6 Range.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ipv6-range).

    ## Example Usage

    Get information about an IPv6 range assigned to a Linode:

    ```python
    import pulumi
    import pulumi_linode as linode

    range_info = linode.get_ipv6_range(range="2001:0db8::")
    ```


    :param builtins.str range: The IPv6 range to retrieve information about.
    """
    __args__ = dict()
    __args__['range'] = range
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getIpv6Range:getIpv6Range', __args__, opts=opts, typ=GetIpv6RangeResult)
    return __ret__.apply(lambda __response__: GetIpv6RangeResult(
        id=pulumi.get(__response__, 'id'),
        is_bgp=pulumi.get(__response__, 'is_bgp'),
        linodes=pulumi.get(__response__, 'linodes'),
        prefix=pulumi.get(__response__, 'prefix'),
        range=pulumi.get(__response__, 'range'),
        region=pulumi.get(__response__, 'region')))
