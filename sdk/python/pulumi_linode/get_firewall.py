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
    'GetFirewallResult',
    'AwaitableGetFirewallResult',
    'get_firewall',
    'get_firewall_output',
]

@pulumi.output_type
class GetFirewallResult:
    """
    A collection of values returned by getFirewall.
    """
    def __init__(__self__, created=None, devices=None, disabled=None, id=None, inbound_policy=None, inbounds=None, label=None, linodes=None, nodebalancers=None, outbound_policy=None, outbounds=None, status=None, tags=None, updated=None):
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if devices and not isinstance(devices, list):
            raise TypeError("Expected argument 'devices' to be a list")
        pulumi.set(__self__, "devices", devices)
        if disabled and not isinstance(disabled, bool):
            raise TypeError("Expected argument 'disabled' to be a bool")
        pulumi.set(__self__, "disabled", disabled)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if inbound_policy and not isinstance(inbound_policy, str):
            raise TypeError("Expected argument 'inbound_policy' to be a str")
        pulumi.set(__self__, "inbound_policy", inbound_policy)
        if inbounds and not isinstance(inbounds, list):
            raise TypeError("Expected argument 'inbounds' to be a list")
        pulumi.set(__self__, "inbounds", inbounds)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if linodes and not isinstance(linodes, list):
            raise TypeError("Expected argument 'linodes' to be a list")
        pulumi.set(__self__, "linodes", linodes)
        if nodebalancers and not isinstance(nodebalancers, list):
            raise TypeError("Expected argument 'nodebalancers' to be a list")
        pulumi.set(__self__, "nodebalancers", nodebalancers)
        if outbound_policy and not isinstance(outbound_policy, str):
            raise TypeError("Expected argument 'outbound_policy' to be a str")
        pulumi.set(__self__, "outbound_policy", outbound_policy)
        if outbounds and not isinstance(outbounds, list):
            raise TypeError("Expected argument 'outbounds' to be a list")
        pulumi.set(__self__, "outbounds", outbounds)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if updated and not isinstance(updated, str):
            raise TypeError("Expected argument 'updated' to be a str")
        pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        When this firewall was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def devices(self) -> Sequence['outputs.GetFirewallDeviceResult']:
        return pulumi.get(self, "devices")

    @property
    @pulumi.getter
    def disabled(self) -> bool:
        """
        If true, the firewall is inactive.
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        The ID of the Firewall Device.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="inboundPolicy")
    def inbound_policy(self) -> str:
        """
        The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
        """
        return pulumi.get(self, "inbound_policy")

    @property
    @pulumi.getter
    def inbounds(self) -> Sequence['outputs.GetFirewallInboundResult']:
        return pulumi.get(self, "inbounds")

    @property
    @pulumi.getter
    def label(self) -> str:
        """
        The label of the underlying entity this device references.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def linodes(self) -> Sequence[int]:
        """
        The IDs of Linodes assigned to this Firewall.
        """
        return pulumi.get(self, "linodes")

    @property
    @pulumi.getter
    def nodebalancers(self) -> Sequence[int]:
        """
        The IDs of NodeBalancers assigned to this Firewall.
        """
        return pulumi.get(self, "nodebalancers")

    @property
    @pulumi.getter(name="outboundPolicy")
    def outbound_policy(self) -> str:
        """
        The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
        """
        return pulumi.get(self, "outbound_policy")

    @property
    @pulumi.getter
    def outbounds(self) -> Sequence['outputs.GetFirewallOutboundResult']:
        return pulumi.get(self, "outbounds")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the firewall. (`enabled`, `disabled`, `deleted`)
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        The tags applied to the firewall. Tags are case-insensitive and are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def updated(self) -> str:
        """
        When this firewall was last updated.
        """
        return pulumi.get(self, "updated")


class AwaitableGetFirewallResult(GetFirewallResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFirewallResult(
            created=self.created,
            devices=self.devices,
            disabled=self.disabled,
            id=self.id,
            inbound_policy=self.inbound_policy,
            inbounds=self.inbounds,
            label=self.label,
            linodes=self.linodes,
            nodebalancers=self.nodebalancers,
            outbound_policy=self.outbound_policy,
            outbounds=self.outbounds,
            status=self.status,
            tags=self.tags,
            updated=self.updated)


def get_firewall(id: Optional[int] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFirewallResult:
    """
    Provides details about a Linode Firewall.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_linode as linode

    my_firewall = linode.get_firewall(id=123)
    ```
    <!--End PulumiCodeChooser -->


    :param int id: The Firewall's ID.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getFirewall:getFirewall', __args__, opts=opts, typ=GetFirewallResult).value

    return AwaitableGetFirewallResult(
        created=pulumi.get(__ret__, 'created'),
        devices=pulumi.get(__ret__, 'devices'),
        disabled=pulumi.get(__ret__, 'disabled'),
        id=pulumi.get(__ret__, 'id'),
        inbound_policy=pulumi.get(__ret__, 'inbound_policy'),
        inbounds=pulumi.get(__ret__, 'inbounds'),
        label=pulumi.get(__ret__, 'label'),
        linodes=pulumi.get(__ret__, 'linodes'),
        nodebalancers=pulumi.get(__ret__, 'nodebalancers'),
        outbound_policy=pulumi.get(__ret__, 'outbound_policy'),
        outbounds=pulumi.get(__ret__, 'outbounds'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        updated=pulumi.get(__ret__, 'updated'))


@_utilities.lift_output_func(get_firewall)
def get_firewall_output(id: Optional[pulumi.Input[int]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFirewallResult]:
    """
    Provides details about a Linode Firewall.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_linode as linode

    my_firewall = linode.get_firewall(id=123)
    ```
    <!--End PulumiCodeChooser -->


    :param int id: The Firewall's ID.
    """
    ...
