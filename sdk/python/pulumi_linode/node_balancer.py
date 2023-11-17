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
from ._inputs import *

__all__ = ['NodeBalancerArgs', 'NodeBalancer']

@pulumi.input_type
class NodeBalancerArgs:
    def __init__(__self__, *,
                 client_conn_throttle: Optional[pulumi.Input[int]] = None,
                 firewall_id: Optional[pulumi.Input[int]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a NodeBalancer resource.
        :param pulumi.Input[int] client_conn_throttle: Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        :param pulumi.Input[int] firewall_id: ID for the firewall you'd like to use with this NodeBalancer.
        :param pulumi.Input[str] label: The label of the Linode NodeBalancer
        :param pulumi.Input[str] region: The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags applied to this object. Tags are for organizational purposes only.
        """
        if client_conn_throttle is not None:
            pulumi.set(__self__, "client_conn_throttle", client_conn_throttle)
        if firewall_id is not None:
            pulumi.set(__self__, "firewall_id", firewall_id)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="clientConnThrottle")
    def client_conn_throttle(self) -> Optional[pulumi.Input[int]]:
        """
        Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        """
        return pulumi.get(self, "client_conn_throttle")

    @client_conn_throttle.setter
    def client_conn_throttle(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "client_conn_throttle", value)

    @property
    @pulumi.getter(name="firewallId")
    def firewall_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID for the firewall you'd like to use with this NodeBalancer.
        """
        return pulumi.get(self, "firewall_id")

    @firewall_id.setter
    def firewall_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "firewall_id", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        The label of the Linode NodeBalancer
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of tags applied to this object. Tags are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _NodeBalancerState:
    def __init__(__self__, *,
                 client_conn_throttle: Optional[pulumi.Input[int]] = None,
                 created: Optional[pulumi.Input[str]] = None,
                 firewall_id: Optional[pulumi.Input[int]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 ipv4: Optional[pulumi.Input[str]] = None,
                 ipv6: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 transfers: Optional[pulumi.Input[Sequence[pulumi.Input['NodeBalancerTransferArgs']]]] = None,
                 updated: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NodeBalancer resources.
        :param pulumi.Input[int] client_conn_throttle: Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        :param pulumi.Input[str] created: When this NodeBalancer was created
        :param pulumi.Input[int] firewall_id: ID for the firewall you'd like to use with this NodeBalancer.
        :param pulumi.Input[str] hostname: This NodeBalancer's hostname, ending with .nodebalancer.linode.com
        :param pulumi.Input[str] ipv4: The Public IPv4 Address of this NodeBalancer
        :param pulumi.Input[str] ipv6: The Public IPv6 Address of this NodeBalancer
        :param pulumi.Input[str] label: The label of the Linode NodeBalancer
        :param pulumi.Input[str] region: The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags applied to this object. Tags are for organizational purposes only.
        :param pulumi.Input[Sequence[pulumi.Input['NodeBalancerTransferArgs']]] transfers: Information about the amount of transfer this NodeBalancer has had so far this month.
        :param pulumi.Input[str] updated: When this NodeBalancer was last updated.
        """
        if client_conn_throttle is not None:
            pulumi.set(__self__, "client_conn_throttle", client_conn_throttle)
        if created is not None:
            pulumi.set(__self__, "created", created)
        if firewall_id is not None:
            pulumi.set(__self__, "firewall_id", firewall_id)
        if hostname is not None:
            pulumi.set(__self__, "hostname", hostname)
        if ipv4 is not None:
            pulumi.set(__self__, "ipv4", ipv4)
        if ipv6 is not None:
            pulumi.set(__self__, "ipv6", ipv6)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if transfers is not None:
            pulumi.set(__self__, "transfers", transfers)
        if updated is not None:
            pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter(name="clientConnThrottle")
    def client_conn_throttle(self) -> Optional[pulumi.Input[int]]:
        """
        Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        """
        return pulumi.get(self, "client_conn_throttle")

    @client_conn_throttle.setter
    def client_conn_throttle(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "client_conn_throttle", value)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        When this NodeBalancer was created
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter(name="firewallId")
    def firewall_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID for the firewall you'd like to use with this NodeBalancer.
        """
        return pulumi.get(self, "firewall_id")

    @firewall_id.setter
    def firewall_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "firewall_id", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        """
        This NodeBalancer's hostname, ending with .nodebalancer.linode.com
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter
    def ipv4(self) -> Optional[pulumi.Input[str]]:
        """
        The Public IPv4 Address of this NodeBalancer
        """
        return pulumi.get(self, "ipv4")

    @ipv4.setter
    def ipv4(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv4", value)

    @property
    @pulumi.getter
    def ipv6(self) -> Optional[pulumi.Input[str]]:
        """
        The Public IPv6 Address of this NodeBalancer
        """
        return pulumi.get(self, "ipv6")

    @ipv6.setter
    def ipv6(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv6", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        The label of the Linode NodeBalancer
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of tags applied to this object. Tags are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def transfers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NodeBalancerTransferArgs']]]]:
        """
        Information about the amount of transfer this NodeBalancer has had so far this month.
        """
        return pulumi.get(self, "transfers")

    @transfers.setter
    def transfers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NodeBalancerTransferArgs']]]]):
        pulumi.set(self, "transfers", value)

    @property
    @pulumi.getter
    def updated(self) -> Optional[pulumi.Input[str]]:
        """
        When this NodeBalancer was last updated.
        """
        return pulumi.get(self, "updated")

    @updated.setter
    def updated(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated", value)


class NodeBalancer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_conn_throttle: Optional[pulumi.Input[int]] = None,
                 firewall_id: Optional[pulumi.Input[int]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Linode NodeBalancer resource.  This can be used to create, modify, and delete Linodes NodeBalancers in Linode's managed load balancer service.
        For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancer).

        ## Example Usage

        The following example shows how one might use this resource to configure a NodeBalancer.

        ```python
        import pulumi
        import pulumi_linode as linode

        foobar = linode.NodeBalancer("foobar",
            client_conn_throttle=20,
            label="mynodebalancer",
            region="us-east",
            tags=["foobar"])
        ```

        ## Import

        Linodes NodeBalancers can be imported using the Linode NodeBalancer `id`, e.g.

        ```sh
         $ pulumi import linode:index/nodeBalancer:NodeBalancer mynodebalancer 1234567
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] client_conn_throttle: Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        :param pulumi.Input[int] firewall_id: ID for the firewall you'd like to use with this NodeBalancer.
        :param pulumi.Input[str] label: The label of the Linode NodeBalancer
        :param pulumi.Input[str] region: The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags applied to this object. Tags are for organizational purposes only.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[NodeBalancerArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Linode NodeBalancer resource.  This can be used to create, modify, and delete Linodes NodeBalancers in Linode's managed load balancer service.
        For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancer).

        ## Example Usage

        The following example shows how one might use this resource to configure a NodeBalancer.

        ```python
        import pulumi
        import pulumi_linode as linode

        foobar = linode.NodeBalancer("foobar",
            client_conn_throttle=20,
            label="mynodebalancer",
            region="us-east",
            tags=["foobar"])
        ```

        ## Import

        Linodes NodeBalancers can be imported using the Linode NodeBalancer `id`, e.g.

        ```sh
         $ pulumi import linode:index/nodeBalancer:NodeBalancer mynodebalancer 1234567
        ```

        :param str resource_name: The name of the resource.
        :param NodeBalancerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NodeBalancerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_conn_throttle: Optional[pulumi.Input[int]] = None,
                 firewall_id: Optional[pulumi.Input[int]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NodeBalancerArgs.__new__(NodeBalancerArgs)

            __props__.__dict__["client_conn_throttle"] = client_conn_throttle
            __props__.__dict__["firewall_id"] = firewall_id
            __props__.__dict__["label"] = label
            __props__.__dict__["region"] = region
            __props__.__dict__["tags"] = tags
            __props__.__dict__["created"] = None
            __props__.__dict__["hostname"] = None
            __props__.__dict__["ipv4"] = None
            __props__.__dict__["ipv6"] = None
            __props__.__dict__["transfers"] = None
            __props__.__dict__["updated"] = None
        super(NodeBalancer, __self__).__init__(
            'linode:index/nodeBalancer:NodeBalancer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            client_conn_throttle: Optional[pulumi.Input[int]] = None,
            created: Optional[pulumi.Input[str]] = None,
            firewall_id: Optional[pulumi.Input[int]] = None,
            hostname: Optional[pulumi.Input[str]] = None,
            ipv4: Optional[pulumi.Input[str]] = None,
            ipv6: Optional[pulumi.Input[str]] = None,
            label: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            transfers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodeBalancerTransferArgs']]]]] = None,
            updated: Optional[pulumi.Input[str]] = None) -> 'NodeBalancer':
        """
        Get an existing NodeBalancer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] client_conn_throttle: Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        :param pulumi.Input[str] created: When this NodeBalancer was created
        :param pulumi.Input[int] firewall_id: ID for the firewall you'd like to use with this NodeBalancer.
        :param pulumi.Input[str] hostname: This NodeBalancer's hostname, ending with .nodebalancer.linode.com
        :param pulumi.Input[str] ipv4: The Public IPv4 Address of this NodeBalancer
        :param pulumi.Input[str] ipv6: The Public IPv6 Address of this NodeBalancer
        :param pulumi.Input[str] label: The label of the Linode NodeBalancer
        :param pulumi.Input[str] region: The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags applied to this object. Tags are for organizational purposes only.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodeBalancerTransferArgs']]]] transfers: Information about the amount of transfer this NodeBalancer has had so far this month.
        :param pulumi.Input[str] updated: When this NodeBalancer was last updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NodeBalancerState.__new__(_NodeBalancerState)

        __props__.__dict__["client_conn_throttle"] = client_conn_throttle
        __props__.__dict__["created"] = created
        __props__.__dict__["firewall_id"] = firewall_id
        __props__.__dict__["hostname"] = hostname
        __props__.__dict__["ipv4"] = ipv4
        __props__.__dict__["ipv6"] = ipv6
        __props__.__dict__["label"] = label
        __props__.__dict__["region"] = region
        __props__.__dict__["tags"] = tags
        __props__.__dict__["transfers"] = transfers
        __props__.__dict__["updated"] = updated
        return NodeBalancer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clientConnThrottle")
    def client_conn_throttle(self) -> pulumi.Output[int]:
        """
        Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        """
        return pulumi.get(self, "client_conn_throttle")

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        When this NodeBalancer was created
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter(name="firewallId")
    def firewall_id(self) -> pulumi.Output[Optional[int]]:
        """
        ID for the firewall you'd like to use with this NodeBalancer.
        """
        return pulumi.get(self, "firewall_id")

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Output[str]:
        """
        This NodeBalancer's hostname, ending with .nodebalancer.linode.com
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter
    def ipv4(self) -> pulumi.Output[str]:
        """
        The Public IPv4 Address of this NodeBalancer
        """
        return pulumi.get(self, "ipv4")

    @property
    @pulumi.getter
    def ipv6(self) -> pulumi.Output[str]:
        """
        The Public IPv6 Address of this NodeBalancer
        """
        return pulumi.get(self, "ipv6")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[Optional[str]]:
        """
        The label of the Linode NodeBalancer
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of tags applied to this object. Tags are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def transfers(self) -> pulumi.Output[Sequence['outputs.NodeBalancerTransfer']]:
        """
        Information about the amount of transfer this NodeBalancer has had so far this month.
        """
        return pulumi.get(self, "transfers")

    @property
    @pulumi.getter
    def updated(self) -> pulumi.Output[str]:
        """
        When this NodeBalancer was last updated.
        """
        return pulumi.get(self, "updated")

