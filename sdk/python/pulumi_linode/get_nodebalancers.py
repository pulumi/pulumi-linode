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
    'GetNodebalancersResult',
    'AwaitableGetNodebalancersResult',
    'get_nodebalancers',
    'get_nodebalancers_output',
]

@pulumi.output_type
class GetNodebalancersResult:
    """
    A collection of values returned by getNodebalancers.
    """
    def __init__(__self__, filters=None, id=None, nodebalancers=None, order=None, order_by=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if nodebalancers and not isinstance(nodebalancers, list):
            raise TypeError("Expected argument 'nodebalancers' to be a list")
        pulumi.set(__self__, "nodebalancers", nodebalancers)
        if order and not isinstance(order, str):
            raise TypeError("Expected argument 'order' to be a str")
        pulumi.set(__self__, "order", order)
        if order_by and not isinstance(order_by, str):
            raise TypeError("Expected argument 'order_by' to be a str")
        pulumi.set(__self__, "order_by", order_by)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetNodebalancersFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Linode NodeBalancer's unique ID
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def nodebalancers(self) -> Optional[Sequence['outputs.GetNodebalancersNodebalancerResult']]:
        return pulumi.get(self, "nodebalancers")

    @property
    @pulumi.getter
    def order(self) -> Optional[str]:
        return pulumi.get(self, "order")

    @property
    @pulumi.getter(name="orderBy")
    def order_by(self) -> Optional[str]:
        return pulumi.get(self, "order_by")


class AwaitableGetNodebalancersResult(GetNodebalancersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNodebalancersResult(
            filters=self.filters,
            id=self.id,
            nodebalancers=self.nodebalancers,
            order=self.order,
            order_by=self.order_by)


def get_nodebalancers(filters: Optional[Sequence[Union['GetNodebalancersFilterArgs', 'GetNodebalancersFilterArgsDict']]] = None,
                      nodebalancers: Optional[Sequence[Union['GetNodebalancersNodebalancerArgs', 'GetNodebalancersNodebalancerArgsDict']]] = None,
                      order: Optional[str] = None,
                      order_by: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNodebalancersResult:
    """
    Provides information about Linode NodeBalancers that match a set of filters.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancers).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode NodeBalancer.

    ```python
    import pulumi
    import pulumi_linode as linode

    specific_nodebalancers = linode.get_nodebalancers(filters=[
        {
            "name": "label",
            "values": ["my-nodebalancer"],
        },
        {
            "name": "region",
            "values": ["us-iad"],
        },
    ])
    pulumi.export("nodebalancerId", specific_nodebalancers.nodebalancers[0].id)
    ```

    ## Filterable Fields

    * `label`

    * `tags`

    * `ipv4`

    * `ipv6`

    * `hostname`

    * `region`

    * `client_conn_throttle`


    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['nodebalancers'] = nodebalancers
    __args__['order'] = order
    __args__['orderBy'] = order_by
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getNodebalancers:getNodebalancers', __args__, opts=opts, typ=GetNodebalancersResult).value

    return AwaitableGetNodebalancersResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        nodebalancers=pulumi.get(__ret__, 'nodebalancers'),
        order=pulumi.get(__ret__, 'order'),
        order_by=pulumi.get(__ret__, 'order_by'))
def get_nodebalancers_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetNodebalancersFilterArgs', 'GetNodebalancersFilterArgsDict']]]]] = None,
                             nodebalancers: Optional[pulumi.Input[Optional[Sequence[Union['GetNodebalancersNodebalancerArgs', 'GetNodebalancersNodebalancerArgsDict']]]]] = None,
                             order: Optional[pulumi.Input[Optional[str]]] = None,
                             order_by: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNodebalancersResult]:
    """
    Provides information about Linode NodeBalancers that match a set of filters.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancers).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode NodeBalancer.

    ```python
    import pulumi
    import pulumi_linode as linode

    specific_nodebalancers = linode.get_nodebalancers(filters=[
        {
            "name": "label",
            "values": ["my-nodebalancer"],
        },
        {
            "name": "region",
            "values": ["us-iad"],
        },
    ])
    pulumi.export("nodebalancerId", specific_nodebalancers.nodebalancers[0].id)
    ```

    ## Filterable Fields

    * `label`

    * `tags`

    * `ipv4`

    * `ipv6`

    * `hostname`

    * `region`

    * `client_conn_throttle`


    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['nodebalancers'] = nodebalancers
    __args__['order'] = order
    __args__['orderBy'] = order_by
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getNodebalancers:getNodebalancers', __args__, opts=opts, typ=GetNodebalancersResult)
    return __ret__.apply(lambda __response__: GetNodebalancersResult(
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        nodebalancers=pulumi.get(__response__, 'nodebalancers'),
        order=pulumi.get(__response__, 'order'),
        order_by=pulumi.get(__response__, 'order_by')))
