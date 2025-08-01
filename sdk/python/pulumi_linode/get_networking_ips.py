# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
from . import outputs
from ._inputs import *

__all__ = [
    'GetNetworkingIpsResult',
    'AwaitableGetNetworkingIpsResult',
    'get_networking_ips',
    'get_networking_ips_output',
]

@pulumi.output_type
class GetNetworkingIpsResult:
    """
    A collection of values returned by getNetworkingIps.
    """
    def __init__(__self__, filters=None, id=None, ip_addresses=None, order=None, order_by=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_addresses and not isinstance(ip_addresses, list):
            raise TypeError("Expected argument 'ip_addresses' to be a list")
        pulumi.set(__self__, "ip_addresses", ip_addresses)
        if order and not isinstance(order, str):
            raise TypeError("Expected argument 'order' to be a str")
        pulumi.set(__self__, "order", order)
        if order_by and not isinstance(order_by, str):
            raise TypeError("Expected argument 'order_by' to be a str")
        pulumi.set(__self__, "order_by", order_by)

    @_builtins.property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetNetworkingIpsFilterResult']]:
        return pulumi.get(self, "filters")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="ipAddresses")
    def ip_addresses(self) -> Optional[Sequence['outputs.GetNetworkingIpsIpAddressResult']]:
        return pulumi.get(self, "ip_addresses")

    @_builtins.property
    @pulumi.getter
    def order(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "order")

    @_builtins.property
    @pulumi.getter(name="orderBy")
    def order_by(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "order_by")


class AwaitableGetNetworkingIpsResult(GetNetworkingIpsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkingIpsResult(
            filters=self.filters,
            id=self.id,
            ip_addresses=self.ip_addresses,
            order=self.order,
            order_by=self.order_by)


def get_networking_ips(filters: Optional[Sequence[Union['GetNetworkingIpsFilterArgs', 'GetNetworkingIpsFilterArgsDict']]] = None,
                       ip_addresses: Optional[Sequence[Union['GetNetworkingIpsIpAddressArgs', 'GetNetworkingIpsIpAddressArgsDict']]] = None,
                       order: Optional[_builtins.str] = None,
                       order_by: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkingIpsResult:
    """
    Provides information about all IP addresses associated with the current Linode account, including both assigned and unassigned reserved IP addresses.

    ## Example Usage

    Retrieve all IPs under the current account:

    ```python
    import pulumi
    import pulumi_linode as linode

    all = linode.get_networking_ips()
    ```

    Retrieve all IPs under the current account in a specific region:

    ```python
    import pulumi
    import pulumi_linode as linode

    filtered = linode.get_networking_ips(filters=[{
        "name": "region",
        "values": ["us-mia"],
    }])
    ```

    ## Filterable Fields

    * `address`

    * `gateway`

    * `subnet_mask`

    * `prefix`

    * `type`

    * `public`

    * `rdns`

    * `linode_id`

    * `region`

    * `reserved`


    :param _builtins.str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param _builtins.str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['ipAddresses'] = ip_addresses
    __args__['order'] = order
    __args__['orderBy'] = order_by
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getNetworkingIps:getNetworkingIps', __args__, opts=opts, typ=GetNetworkingIpsResult).value

    return AwaitableGetNetworkingIpsResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        ip_addresses=pulumi.get(__ret__, 'ip_addresses'),
        order=pulumi.get(__ret__, 'order'),
        order_by=pulumi.get(__ret__, 'order_by'))
def get_networking_ips_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetNetworkingIpsFilterArgs', 'GetNetworkingIpsFilterArgsDict']]]]] = None,
                              ip_addresses: Optional[pulumi.Input[Optional[Sequence[Union['GetNetworkingIpsIpAddressArgs', 'GetNetworkingIpsIpAddressArgsDict']]]]] = None,
                              order: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              order_by: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNetworkingIpsResult]:
    """
    Provides information about all IP addresses associated with the current Linode account, including both assigned and unassigned reserved IP addresses.

    ## Example Usage

    Retrieve all IPs under the current account:

    ```python
    import pulumi
    import pulumi_linode as linode

    all = linode.get_networking_ips()
    ```

    Retrieve all IPs under the current account in a specific region:

    ```python
    import pulumi
    import pulumi_linode as linode

    filtered = linode.get_networking_ips(filters=[{
        "name": "region",
        "values": ["us-mia"],
    }])
    ```

    ## Filterable Fields

    * `address`

    * `gateway`

    * `subnet_mask`

    * `prefix`

    * `type`

    * `public`

    * `rdns`

    * `linode_id`

    * `region`

    * `reserved`


    :param _builtins.str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param _builtins.str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['ipAddresses'] = ip_addresses
    __args__['order'] = order
    __args__['orderBy'] = order_by
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getNetworkingIps:getNetworkingIps', __args__, opts=opts, typ=GetNetworkingIpsResult)
    return __ret__.apply(lambda __response__: GetNetworkingIpsResult(
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        ip_addresses=pulumi.get(__response__, 'ip_addresses'),
        order=pulumi.get(__response__, 'order'),
        order_by=pulumi.get(__response__, 'order_by')))
