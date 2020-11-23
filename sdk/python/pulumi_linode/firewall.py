# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Firewall']


class Firewall(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 inbounds: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallInboundArgs']]]]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 linodes: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 outbounds: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallOutboundArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        > **NOTICE:** The Firewall feature is currently available through early access.

        Manages a Linode Firewall.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_linode as linode

        my_instance = linode.Instance("myInstance",
            label="my_instance",
            image="linode/ubuntu18.04",
            region="us-east",
            type="g6-standard-1",
            root_pass="bogusPassword$",
            swap_size=256)
        my_firewall = linode.Firewall("myFirewall",
            label="my_firewall",
            tags=["test"],
            inbounds=[linode.FirewallInboundArgs(
                protocol="TCP",
                ports=["80"],
                addresses=["0.0.0.0/0"],
            )],
            outbounds=[linode.FirewallOutboundArgs(
                protocol="TCP",
                ports=["80"],
                addresses=["0.0.0.0/0"],
            )],
            linodes=[my_instance.id])
        ```

        ## Import

        Firewalls can be imported using the `id`, e.g.

        ```sh
         $ pulumi import linode:index/firewall:Firewall my_firewall 12345
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] disabled: If `true`, the Firewall's rules are not enforced (defaults to `false`).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallInboundArgs']]]] inbounds: A firewall rule that specifies what inbound network traffic is allowed.
        :param pulumi.Input[str] label: This Firewall's unique label.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] linodes: A list of IDs of Linodes this Firewall should govern it's network traffic for.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallOutboundArgs']]]] outbounds: A firewall rule that specifies what outbound network traffic is allowed.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['disabled'] = disabled
            __props__['inbounds'] = inbounds
            __props__['label'] = label
            if linodes is None:
                raise TypeError("Missing required property 'linodes'")
            __props__['linodes'] = linodes
            __props__['outbounds'] = outbounds
            __props__['tags'] = tags
            __props__['devices'] = None
            __props__['status'] = None
        super(Firewall, __self__).__init__(
            'linode:index/firewall:Firewall',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            devices: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallDeviceArgs']]]]] = None,
            disabled: Optional[pulumi.Input[bool]] = None,
            inbounds: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallInboundArgs']]]]] = None,
            label: Optional[pulumi.Input[str]] = None,
            linodes: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
            outbounds: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallOutboundArgs']]]]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Firewall':
        """
        Get an existing Firewall resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallDeviceArgs']]]] devices: The devices associated with this firewall.
        :param pulumi.Input[bool] disabled: If `true`, the Firewall's rules are not enforced (defaults to `false`).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallInboundArgs']]]] inbounds: A firewall rule that specifies what inbound network traffic is allowed.
        :param pulumi.Input[str] label: This Firewall's unique label.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] linodes: A list of IDs of Linodes this Firewall should govern it's network traffic for.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallOutboundArgs']]]] outbounds: A firewall rule that specifies what outbound network traffic is allowed.
        :param pulumi.Input[str] status: The status of the Firewall.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["devices"] = devices
        __props__["disabled"] = disabled
        __props__["inbounds"] = inbounds
        __props__["label"] = label
        __props__["linodes"] = linodes
        __props__["outbounds"] = outbounds
        __props__["status"] = status
        __props__["tags"] = tags
        return Firewall(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def devices(self) -> pulumi.Output[Sequence['outputs.FirewallDevice']]:
        """
        The devices associated with this firewall.
        """
        return pulumi.get(self, "devices")

    @property
    @pulumi.getter
    def disabled(self) -> pulumi.Output[Optional[bool]]:
        """
        If `true`, the Firewall's rules are not enforced (defaults to `false`).
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter
    def inbounds(self) -> pulumi.Output[Optional[Sequence['outputs.FirewallInbound']]]:
        """
        A firewall rule that specifies what inbound network traffic is allowed.
        """
        return pulumi.get(self, "inbounds")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        This Firewall's unique label.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def linodes(self) -> pulumi.Output[Sequence[int]]:
        """
        A list of IDs of Linodes this Firewall should govern it's network traffic for.
        """
        return pulumi.get(self, "linodes")

    @property
    @pulumi.getter
    def outbounds(self) -> pulumi.Output[Optional[Sequence['outputs.FirewallOutbound']]]:
        """
        A firewall rule that specifies what outbound network traffic is allowed.
        """
        return pulumi.get(self, "outbounds")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the Firewall.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

