# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetNodeBalancerResult',
    'AwaitableGetNodeBalancerResult',
    'get_node_balancer',
]

@pulumi.output_type
class GetNodeBalancerResult:
    """
    A collection of values returned by getNodeBalancer.
    """
    def __init__(__self__, client_conn_throttle=None, created=None, hostname=None, id=None, ipv4=None, ipv6=None, label=None, region=None, tags=None, transfers=None, updated=None):
        if client_conn_throttle and not isinstance(client_conn_throttle, int):
            raise TypeError("Expected argument 'client_conn_throttle' to be a int")
        pulumi.set(__self__, "client_conn_throttle", client_conn_throttle)
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
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
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def hostname(self) -> str:
        """
        This NodeBalancer's hostname, ending with .nodebalancer.linode.com
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter
    def id(self) -> int:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ipv4(self) -> str:
        """
        The Public IPv4 Address of this NodeBalancer
        """
        return pulumi.get(self, "ipv4")

    @property
    @pulumi.getter
    def ipv6(self) -> str:
        """
        The Public IPv6 Address of this NodeBalancer
        """
        return pulumi.get(self, "ipv6")

    @property
    @pulumi.getter
    def label(self) -> str:
        """
        The label of the Linode NodeBalancer
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def region(self) -> str:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        A list of tags applied to this object. Tags are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def transfers(self) -> Sequence['outputs.GetNodeBalancerTransferResult']:
        return pulumi.get(self, "transfers")

    @property
    @pulumi.getter
    def updated(self) -> str:
        return pulumi.get(self, "updated")


class AwaitableGetNodeBalancerResult(GetNodeBalancerResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNodeBalancerResult(
            client_conn_throttle=self.client_conn_throttle,
            created=self.created,
            hostname=self.hostname,
            id=self.id,
            ipv4=self.ipv4,
            ipv6=self.ipv6,
            label=self.label,
            region=self.region,
            tags=self.tags,
            transfers=self.transfers,
            updated=self.updated)


def get_node_balancer(id: Optional[int] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNodeBalancerResult:
    """
    Provides details about a Linode NodeBalancer.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    my_nodebalancer = linode.get_node_balancer(id=123)
    ```


    :param int id: The NodeBalancer's ID.
    """
    __args__ = dict()
    __args__['id'] = id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getNodeBalancer:getNodeBalancer', __args__, opts=opts, typ=GetNodeBalancerResult).value

    return AwaitableGetNodeBalancerResult(
        client_conn_throttle=__ret__.client_conn_throttle,
        created=__ret__.created,
        hostname=__ret__.hostname,
        id=__ret__.id,
        ipv4=__ret__.ipv4,
        ipv6=__ret__.ipv6,
        label=__ret__.label,
        region=__ret__.region,
        tags=__ret__.tags,
        transfers=__ret__.transfers,
        updated=__ret__.updated)
