# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = [
    'GetNetworkingIpResult',
    'AwaitableGetNetworkingIpResult',
    'get_networking_ip',
]

@pulumi.output_type
class GetNetworkingIpResult:
    """
    A collection of values returned by getNetworkingIp.
    """
    def __init__(__self__, address=None, gateway=None, id=None, linode_id=None, prefix=None, public=None, rdns=None, region=None, subnet_mask=None, type=None):
        if address and not isinstance(address, str):
            raise TypeError("Expected argument 'address' to be a str")
        pulumi.set(__self__, "address", address)
        if gateway and not isinstance(gateway, str):
            raise TypeError("Expected argument 'gateway' to be a str")
        pulumi.set(__self__, "gateway", gateway)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if linode_id and not isinstance(linode_id, int):
            raise TypeError("Expected argument 'linode_id' to be a int")
        pulumi.set(__self__, "linode_id", linode_id)
        if prefix and not isinstance(prefix, int):
            raise TypeError("Expected argument 'prefix' to be a int")
        pulumi.set(__self__, "prefix", prefix)
        if public and not isinstance(public, bool):
            raise TypeError("Expected argument 'public' to be a bool")
        pulumi.set(__self__, "public", public)
        if rdns and not isinstance(rdns, str):
            raise TypeError("Expected argument 'rdns' to be a str")
        pulumi.set(__self__, "rdns", rdns)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if subnet_mask and not isinstance(subnet_mask, str):
            raise TypeError("Expected argument 'subnet_mask' to be a str")
        pulumi.set(__self__, "subnet_mask", subnet_mask)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def address(self) -> str:
        return pulumi.get(self, "address")

    @property
    @pulumi.getter
    def gateway(self) -> str:
        return pulumi.get(self, "gateway")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> int:
        return pulumi.get(self, "linode_id")

    @property
    @pulumi.getter
    def prefix(self) -> int:
        return pulumi.get(self, "prefix")

    @property
    @pulumi.getter
    def public(self) -> bool:
        return pulumi.get(self, "public")

    @property
    @pulumi.getter
    def rdns(self) -> str:
        return pulumi.get(self, "rdns")

    @property
    @pulumi.getter
    def region(self) -> str:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="subnetMask")
    def subnet_mask(self) -> str:
        return pulumi.get(self, "subnet_mask")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")


class AwaitableGetNetworkingIpResult(GetNetworkingIpResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkingIpResult(
            address=self.address,
            gateway=self.gateway,
            id=self.id,
            linode_id=self.linode_id,
            prefix=self.prefix,
            public=self.public,
            rdns=self.rdns,
            region=self.region,
            subnet_mask=self.subnet_mask,
            type=self.type)


def get_networking_ip(address: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkingIpResult:
    """
    Provides information about a Linode Networking IP Address

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Networking IP Address.

    ```python
    import pulumi
    import pulumi_linode as linode

    ns1_linode_com = linode.get_networking_ip(address="162.159.27.72")
    ```
    ## Attributes

    The Linode Network IP Address resource exports the following attributes:

    * `address` - The IP address.

    * `gateway` - The default gateway for this address.

    * `subnet_mask` - The mask that separates host bits from network bits for this address.

    * `prefix` - The number of bits set in the subnet mask.

    * `type` - The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).

    * `public` - Whether this is a public or private IP address.

    * `rdns` - The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.

    * `linode_id` - The ID of the Linode this address currently belongs to.

    * `region` - The Region this IP address resides in.


    :param str address: The IP Address to access.  The address must be associated with the account and a resource that the user has access to view.
    """
    __args__ = dict()
    __args__['address'] = address
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getNetworkingIp:getNetworkingIp', __args__, opts=opts, typ=GetNetworkingIpResult).value

    return AwaitableGetNetworkingIpResult(
        address=__ret__.address,
        gateway=__ret__.gateway,
        id=__ret__.id,
        linode_id=__ret__.linode_id,
        prefix=__ret__.prefix,
        public=__ret__.public,
        rdns=__ret__.rdns,
        region=__ret__.region,
        subnet_mask=__ret__.subnet_mask,
        type=__ret__.type)
