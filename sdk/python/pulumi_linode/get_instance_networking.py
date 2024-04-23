# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetInstanceNetworkingResult',
    'AwaitableGetInstanceNetworkingResult',
    'get_instance_networking',
    'get_instance_networking_output',
]

@pulumi.output_type
class GetInstanceNetworkingResult:
    """
    A collection of values returned by getInstanceNetworking.
    """
    def __init__(__self__, id=None, ipv4s=None, ipv6s=None, linode_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipv4s and not isinstance(ipv4s, list):
            raise TypeError("Expected argument 'ipv4s' to be a list")
        pulumi.set(__self__, "ipv4s", ipv4s)
        if ipv6s and not isinstance(ipv6s, list):
            raise TypeError("Expected argument 'ipv6s' to be a list")
        pulumi.set(__self__, "ipv6s", ipv6s)
        if linode_id and not isinstance(linode_id, int):
            raise TypeError("Expected argument 'linode_id' to be a int")
        pulumi.set(__self__, "linode_id", linode_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ipv4s(self) -> Sequence['outputs.GetInstanceNetworkingIpv4Result']:
        return pulumi.get(self, "ipv4s")

    @property
    @pulumi.getter
    def ipv6s(self) -> Sequence['outputs.GetInstanceNetworkingIpv6Result']:
        return pulumi.get(self, "ipv6s")

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> int:
        """
        The ID of the Linode this address currently belongs to.
        """
        return pulumi.get(self, "linode_id")


class AwaitableGetInstanceNetworkingResult(GetInstanceNetworkingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceNetworkingResult(
            id=self.id,
            ipv4s=self.ipv4s,
            ipv6s=self.ipv6s,
            linode_id=self.linode_id)


def get_instance_networking(linode_id: Optional[int] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceNetworkingResult:
    """
    Provides details about the networking configuration of an Instance.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    example = linode.get_instance_networking(linode_id=123)
    ```


    :param int linode_id: The Linode instance's ID.
    """
    __args__ = dict()
    __args__['linodeId'] = linode_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getInstanceNetworking:getInstanceNetworking', __args__, opts=opts, typ=GetInstanceNetworkingResult).value

    return AwaitableGetInstanceNetworkingResult(
        id=pulumi.get(__ret__, 'id'),
        ipv4s=pulumi.get(__ret__, 'ipv4s'),
        ipv6s=pulumi.get(__ret__, 'ipv6s'),
        linode_id=pulumi.get(__ret__, 'linode_id'))


@_utilities.lift_output_func(get_instance_networking)
def get_instance_networking_output(linode_id: Optional[pulumi.Input[int]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInstanceNetworkingResult]:
    """
    Provides details about the networking configuration of an Instance.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    example = linode.get_instance_networking(linode_id=123)
    ```


    :param int linode_id: The Linode instance's ID.
    """
    ...
