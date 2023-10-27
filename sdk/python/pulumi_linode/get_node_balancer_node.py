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
    'GetNodeBalancerNodeResult',
    'AwaitableGetNodeBalancerNodeResult',
    'get_node_balancer_node',
    'get_node_balancer_node_output',
]

@pulumi.output_type
class GetNodeBalancerNodeResult:
    """
    A collection of values returned by getNodeBalancerNode.
    """
    def __init__(__self__, address=None, config_id=None, id=None, label=None, mode=None, nodebalancer_id=None, status=None, weight=None):
        if address and not isinstance(address, str):
            raise TypeError("Expected argument 'address' to be a str")
        pulumi.set(__self__, "address", address)
        if config_id and not isinstance(config_id, int):
            raise TypeError("Expected argument 'config_id' to be a int")
        pulumi.set(__self__, "config_id", config_id)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if mode and not isinstance(mode, str):
            raise TypeError("Expected argument 'mode' to be a str")
        pulumi.set(__self__, "mode", mode)
        if nodebalancer_id and not isinstance(nodebalancer_id, int):
            raise TypeError("Expected argument 'nodebalancer_id' to be a int")
        pulumi.set(__self__, "nodebalancer_id", nodebalancer_id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if weight and not isinstance(weight, int):
            raise TypeError("Expected argument 'weight' to be a int")
        pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def address(self) -> str:
        """
        The private IP Address where this backend can be reached.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> int:
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter
    def id(self) -> int:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def label(self) -> str:
        """
        The label of the Linode NodeBalancer Node. This is for display purposes only.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def mode(self) -> str:
        """
        The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="nodebalancerId")
    def nodebalancer_id(self) -> int:
        return pulumi.get(self, "nodebalancer_id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def weight(self) -> int:
        """
        Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        return pulumi.get(self, "weight")


class AwaitableGetNodeBalancerNodeResult(GetNodeBalancerNodeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNodeBalancerNodeResult(
            address=self.address,
            config_id=self.config_id,
            id=self.id,
            label=self.label,
            mode=self.mode,
            nodebalancer_id=self.nodebalancer_id,
            status=self.status,
            weight=self.weight)


def get_node_balancer_node(config_id: Optional[int] = None,
                           id: Optional[int] = None,
                           nodebalancer_id: Optional[int] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNodeBalancerNodeResult:
    """
    Provides details about a Linode NodeBalancer node.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    my_node = linode.get_node_balancer_node(config_id=789,
        id=123,
        nodebalancer_id=456)
    ```


    :param int config_id: The ID of the config that contains the Node.
    :param int id: The node's ID.
    :param int nodebalancer_id: The ID of the NodeBalancer that contains the node.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['id'] = id
    __args__['nodebalancerId'] = nodebalancer_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getNodeBalancerNode:getNodeBalancerNode', __args__, opts=opts, typ=GetNodeBalancerNodeResult).value

    return AwaitableGetNodeBalancerNodeResult(
        address=pulumi.get(__ret__, 'address'),
        config_id=pulumi.get(__ret__, 'config_id'),
        id=pulumi.get(__ret__, 'id'),
        label=pulumi.get(__ret__, 'label'),
        mode=pulumi.get(__ret__, 'mode'),
        nodebalancer_id=pulumi.get(__ret__, 'nodebalancer_id'),
        status=pulumi.get(__ret__, 'status'),
        weight=pulumi.get(__ret__, 'weight'))


@_utilities.lift_output_func(get_node_balancer_node)
def get_node_balancer_node_output(config_id: Optional[pulumi.Input[int]] = None,
                                  id: Optional[pulumi.Input[int]] = None,
                                  nodebalancer_id: Optional[pulumi.Input[int]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNodeBalancerNodeResult]:
    """
    Provides details about a Linode NodeBalancer node.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    my_node = linode.get_node_balancer_node(config_id=789,
        id=123,
        nodebalancer_id=456)
    ```


    :param int config_id: The ID of the config that contains the Node.
    :param int id: The node's ID.
    :param int nodebalancer_id: The ID of the NodeBalancer that contains the node.
    """
    ...
