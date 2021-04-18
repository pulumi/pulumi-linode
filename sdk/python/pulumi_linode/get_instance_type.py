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
    'GetInstanceTypeResult',
    'AwaitableGetInstanceTypeResult',
    'get_instance_type',
]

@pulumi.output_type
class GetInstanceTypeResult:
    """
    A collection of values returned by getInstanceType.
    """
    def __init__(__self__, addons=None, class_=None, disk=None, id=None, label=None, memory=None, network_out=None, price=None, transfer=None, vcpus=None):
        if addons and not isinstance(addons, dict):
            raise TypeError("Expected argument 'addons' to be a dict")
        pulumi.set(__self__, "addons", addons)
        if class_ and not isinstance(class_, str):
            raise TypeError("Expected argument 'class_' to be a str")
        pulumi.set(__self__, "class_", class_)
        if disk and not isinstance(disk, int):
            raise TypeError("Expected argument 'disk' to be a int")
        pulumi.set(__self__, "disk", disk)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if memory and not isinstance(memory, int):
            raise TypeError("Expected argument 'memory' to be a int")
        pulumi.set(__self__, "memory", memory)
        if network_out and not isinstance(network_out, int):
            raise TypeError("Expected argument 'network_out' to be a int")
        pulumi.set(__self__, "network_out", network_out)
        if price and not isinstance(price, dict):
            raise TypeError("Expected argument 'price' to be a dict")
        pulumi.set(__self__, "price", price)
        if transfer and not isinstance(transfer, int):
            raise TypeError("Expected argument 'transfer' to be a int")
        pulumi.set(__self__, "transfer", transfer)
        if vcpus and not isinstance(vcpus, int):
            raise TypeError("Expected argument 'vcpus' to be a int")
        pulumi.set(__self__, "vcpus", vcpus)

    @property
    @pulumi.getter
    def addons(self) -> 'outputs.GetInstanceTypeAddonsResult':
        return pulumi.get(self, "addons")

    @property
    @pulumi.getter(name="class")
    def class_(self) -> str:
        return pulumi.get(self, "class_")

    @property
    @pulumi.getter
    def disk(self) -> int:
        return pulumi.get(self, "disk")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def label(self) -> str:
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def memory(self) -> int:
        return pulumi.get(self, "memory")

    @property
    @pulumi.getter(name="networkOut")
    def network_out(self) -> int:
        return pulumi.get(self, "network_out")

    @property
    @pulumi.getter
    def price(self) -> 'outputs.GetInstanceTypePriceResult':
        return pulumi.get(self, "price")

    @property
    @pulumi.getter
    def transfer(self) -> int:
        return pulumi.get(self, "transfer")

    @property
    @pulumi.getter
    def vcpus(self) -> int:
        return pulumi.get(self, "vcpus")


class AwaitableGetInstanceTypeResult(GetInstanceTypeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceTypeResult(
            addons=self.addons,
            class_=self.class_,
            disk=self.disk,
            id=self.id,
            label=self.label,
            memory=self.memory,
            network_out=self.network_out,
            price=self.price,
            transfer=self.transfer,
            vcpus=self.vcpus)


def get_instance_type(id: Optional[str] = None,
                      label: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceTypeResult:
    """
    Provides information about a Linode instance type

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Instance type.

    ```python
    import pulumi
    import pulumi_linode as linode

    default = linode.get_instance_type(id="g6-standard-2")
    ```
    ## Attributes

    The Linode Instance Type resource exports the following attributes:

    * `id` - The ID representing the Linode Type

    * `label` - The Linode Type's label is for display purposes only

    * `class` - The class of the Linode Type

    * `disk` - The Disk size, in MB, of the Linode Type

    * `price.0.hourly` -  Cost (in US dollars) per hour.

    * `price.0.monthly` - Cost (in US dollars) per month.

    * `addons.0.backups.0.price.0.hourly` - The cost (in US dollars) per hour to add Backups service.

    * `addons.0.backups.0.price.0.monthly` - The cost (in US dollars) per month to add Backups service.

    * `network_out` - The Mbits outbound bandwidth allocation.

    * `memory` - The amount of RAM included in this Linode Type.

    * `transfer` - The monthly outbound transfer amount, in MB.

    * `vcpus` - The number of VCPU cores this Linode Type offers.


    :param str id: Label used to identify instance type
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['label'] = label
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getInstanceType:getInstanceType', __args__, opts=opts, typ=GetInstanceTypeResult).value

    return AwaitableGetInstanceTypeResult(
        addons=__ret__.addons,
        class_=__ret__.class_,
        disk=__ret__.disk,
        id=__ret__.id,
        label=__ret__.label,
        memory=__ret__.memory,
        network_out=__ret__.network_out,
        price=__ret__.price,
        transfer=__ret__.transfer,
        vcpus=__ret__.vcpus)
