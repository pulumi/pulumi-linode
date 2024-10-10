# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
from . import outputs
from ._inputs import *

__all__ = [
    'GetNodeBalancerResult',
    'AwaitableGetNodeBalancerResult',
    'get_node_balancer',
    'get_node_balancer_output',
]

@pulumi.output_type
class GetNodeBalancerResult:
    """
    A collection of values returned by getNodeBalancer.
    """
    def __init__(__self__, client_conn_throttle=None, created=None, firewalls=None, hostname=None, id=None, ipv4=None, ipv6=None, label=None, region=None, tags=None, transfers=None, updated=None):
        if client_conn_throttle and not isinstance(client_conn_throttle, int):
            raise TypeError("Expected argument 'client_conn_throttle' to be a int")
        pulumi.set(__self__, "client_conn_throttle", client_conn_throttle)
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if firewalls and not isinstance(firewalls, list):
            raise TypeError("Expected argument 'firewalls' to be a list")
        pulumi.set(__self__, "firewalls", firewalls)
        if hostname and not isinstance(hostname, str):
            raise TypeError("Expected argument 'hostname' to be a str")
        pulumi.set(__self__, "hostname", hostname)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if ipv4 and not isinstance(ipv4, str):
            raise TypeError("Expected argument 'ipv4' to be a str")
        pulumi.set(__self__, "ipv4", ipv4)
        if ipv6 and not isinstance(ipv6, str):
            raise TypeError("Expected argument 'ipv6' to be a str")
        pulumi.set(__self__, "ipv6", ipv6)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if transfers and not isinstance(transfers, list):
            raise TypeError("Expected argument 'transfers' to be a list")
        pulumi.set(__self__, "transfers", transfers)
        if updated and not isinstance(updated, str):
            raise TypeError("Expected argument 'updated' to be a str")
        pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter(name="clientConnThrottle")
    def client_conn_throttle(self) -> int:
        """
        Throttle connections per second (0-20).
        """
        return pulumi.get(self, "client_conn_throttle")

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        When this firewall was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def firewalls(self) -> Optional[Sequence['outputs.GetNodeBalancerFirewallResult']]:
        return pulumi.get(self, "firewalls")

    @property
    @pulumi.getter
    def hostname(self) -> str:
        """
        This NodeBalancer's hostname, ending with .ip.linodeusercontent.com
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        The Firewall's ID.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ipv4(self) -> str:
        """
        A list of IPv4 addresses or networks. Must be in IP/mask format.
        """
        return pulumi.get(self, "ipv4")

    @property
    @pulumi.getter
    def ipv6(self) -> str:
        """
        A list of IPv6 addresses or networks. Must be in IP/mask format.
        """
        return pulumi.get(self, "ipv6")

    @property
    @pulumi.getter
    def label(self) -> str:
        """
        Used to identify this rule. For display purposes only.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The Region where this Linode NodeBalancer is located. NodeBalancers only support backends in the same Region.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        The tags applied to the firewall. Tags are case-insensitive and are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def transfers(self) -> Sequence['outputs.GetNodeBalancerTransferResult']:
        return pulumi.get(self, "transfers")

    @property
    @pulumi.getter
    def updated(self) -> str:
        """
        When this firewall was last updated.
        """
        return pulumi.get(self, "updated")


class AwaitableGetNodeBalancerResult(GetNodeBalancerResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNodeBalancerResult(
            client_conn_throttle=self.client_conn_throttle,
            created=self.created,
            firewalls=self.firewalls,
            hostname=self.hostname,
            id=self.id,
            ipv4=self.ipv4,
            ipv6=self.ipv6,
            label=self.label,
            region=self.region,
            tags=self.tags,
            transfers=self.transfers,
            updated=self.updated)


def get_node_balancer(firewalls: Optional[Sequence[Union['GetNodeBalancerFirewallArgs', 'GetNodeBalancerFirewallArgsDict']]] = None,
                      id: Optional[int] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNodeBalancerResult:
    """
    Provides details about a Linode NodeBalancer.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancer).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    my_nodebalancer = linode.get_node_balancer(id=123)
    ```


    :param int id: The NodeBalancer's ID.
    """
    __args__ = dict()
    __args__['firewalls'] = firewalls
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getNodeBalancer:getNodeBalancer', __args__, opts=opts, typ=GetNodeBalancerResult).value

    return AwaitableGetNodeBalancerResult(
        client_conn_throttle=pulumi.get(__ret__, 'client_conn_throttle'),
        created=pulumi.get(__ret__, 'created'),
        firewalls=pulumi.get(__ret__, 'firewalls'),
        hostname=pulumi.get(__ret__, 'hostname'),
        id=pulumi.get(__ret__, 'id'),
        ipv4=pulumi.get(__ret__, 'ipv4'),
        ipv6=pulumi.get(__ret__, 'ipv6'),
        label=pulumi.get(__ret__, 'label'),
        region=pulumi.get(__ret__, 'region'),
        tags=pulumi.get(__ret__, 'tags'),
        transfers=pulumi.get(__ret__, 'transfers'),
        updated=pulumi.get(__ret__, 'updated'))
def get_node_balancer_output(firewalls: Optional[pulumi.Input[Optional[Sequence[Union['GetNodeBalancerFirewallArgs', 'GetNodeBalancerFirewallArgsDict']]]]] = None,
                             id: Optional[pulumi.Input[int]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNodeBalancerResult]:
    """
    Provides details about a Linode NodeBalancer.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancer).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    my_nodebalancer = linode.get_node_balancer(id=123)
    ```


    :param int id: The NodeBalancer's ID.
    """
    __args__ = dict()
    __args__['firewalls'] = firewalls
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getNodeBalancer:getNodeBalancer', __args__, opts=opts, typ=GetNodeBalancerResult)
    return __ret__.apply(lambda __response__: GetNodeBalancerResult(
        client_conn_throttle=pulumi.get(__response__, 'client_conn_throttle'),
        created=pulumi.get(__response__, 'created'),
        firewalls=pulumi.get(__response__, 'firewalls'),
        hostname=pulumi.get(__response__, 'hostname'),
        id=pulumi.get(__response__, 'id'),
        ipv4=pulumi.get(__response__, 'ipv4'),
        ipv6=pulumi.get(__response__, 'ipv6'),
        label=pulumi.get(__response__, 'label'),
        region=pulumi.get(__response__, 'region'),
        tags=pulumi.get(__response__, 'tags'),
        transfers=pulumi.get(__response__, 'transfers'),
        updated=pulumi.get(__response__, 'updated')))
