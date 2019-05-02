# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class GetNetworkingIpResult:
    """
    A collection of values returned by getNetworkingIp.
    """
    def __init__(__self__, address=None, gateway=None, linode_id=None, prefix=None, public=None, rdns=None, region=None, subnet_mask=None, type=None, id=None):
        if address and not isinstance(address, str):
            raise TypeError("Expected argument 'address' to be a str")
        __self__.address = address
        if gateway and not isinstance(gateway, str):
            raise TypeError("Expected argument 'gateway' to be a str")
        __self__.gateway = gateway
        if linode_id and not isinstance(linode_id, float):
            raise TypeError("Expected argument 'linode_id' to be a float")
        __self__.linode_id = linode_id
        if prefix and not isinstance(prefix, float):
            raise TypeError("Expected argument 'prefix' to be a float")
        __self__.prefix = prefix
        if public and not isinstance(public, bool):
            raise TypeError("Expected argument 'public' to be a bool")
        __self__.public = public
        if rdns and not isinstance(rdns, str):
            raise TypeError("Expected argument 'rdns' to be a str")
        __self__.rdns = rdns
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        __self__.region = region
        if subnet_mask and not isinstance(subnet_mask, str):
            raise TypeError("Expected argument 'subnet_mask' to be a str")
        __self__.subnet_mask = subnet_mask
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        __self__.type = type
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """

async def get_networking_ip(address=None,opts=None):
    """
    Provides information about a Linode Networking IP Address
    
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
    """
    __args__ = dict()

    __args__['address'] = address
    __ret__ = await pulumi.runtime.invoke('linode:index/getNetworkingIp:getNetworkingIp', __args__, opts=opts)

    return GetNetworkingIpResult(
        address=__ret__.get('address'),
        gateway=__ret__.get('gateway'),
        linode_id=__ret__.get('linodeId'),
        prefix=__ret__.get('prefix'),
        public=__ret__.get('public'),
        rdns=__ret__.get('rdns'),
        region=__ret__.get('region'),
        subnet_mask=__ret__.get('subnetMask'),
        type=__ret__.get('type'),
        id=__ret__.get('id'))
