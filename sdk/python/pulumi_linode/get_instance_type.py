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
    'GetInstanceTypeResult',
    'AwaitableGetInstanceTypeResult',
    'get_instance_type',
    'get_instance_type_output',
]

@pulumi.output_type
class GetInstanceTypeResult:
    """
    A collection of values returned by getInstanceType.
    """
    def __init__(__self__, addons=None, class_=None, disk=None, id=None, label=None, memory=None, network_out=None, price=None, region_prices=None, transfer=None, vcpus=None):
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
        if region_prices and not isinstance(region_prices, list):
            raise TypeError("Expected argument 'region_prices' to be a list")
        pulumi.set(__self__, "region_prices", region_prices)
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
        """
        The class of the Linode Type. See all classes [here](https://techdocs.akamai.com/linode-api/reference/get-linode-type).
        """
        return pulumi.get(self, "class_")

    @property
    @pulumi.getter
    def disk(self) -> int:
        """
        The Disk size, in MB, of the Linode Type
        """
        return pulumi.get(self, "disk")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID representing the Linode Type
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def label(self) -> str:
        """
        The Linode Type's label is for display purposes only
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def memory(self) -> int:
        """
        The amount of RAM included in this Linode Type.
        """
        return pulumi.get(self, "memory")

    @property
    @pulumi.getter(name="networkOut")
    def network_out(self) -> int:
        """
        The Mbits outbound bandwidth allocation.
        """
        return pulumi.get(self, "network_out")

    @property
    @pulumi.getter
    def price(self) -> 'outputs.GetInstanceTypePriceResult':
        return pulumi.get(self, "price")

    @property
    @pulumi.getter(name="regionPrices")
    def region_prices(self) -> Sequence['outputs.GetInstanceTypeRegionPriceResult']:
        return pulumi.get(self, "region_prices")

    @property
    @pulumi.getter
    def transfer(self) -> int:
        """
        The monthly outbound transfer amount, in MB.
        """
        return pulumi.get(self, "transfer")

    @property
    @pulumi.getter
    def vcpus(self) -> int:
        """
        The number of VCPU cores this Linode Type offers.
        """
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
            region_prices=self.region_prices,
            transfer=self.transfer,
            vcpus=self.vcpus)


def get_instance_type(id: Optional[str] = None,
                      label: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceTypeResult:
    """
    Provides information about a Linode instance type
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-linode-type).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Instance type.

    ```python
    import pulumi
    import pulumi_linode as linode

    default = linode.get_instance_type(id="g6-standard-2")
    ```


    :param str id: Label used to identify instance type
    :param str label: The Linode Type's label is for display purposes only
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['label'] = label
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getInstanceType:getInstanceType', __args__, opts=opts, typ=GetInstanceTypeResult).value

    return AwaitableGetInstanceTypeResult(
        addons=pulumi.get(__ret__, 'addons'),
        class_=pulumi.get(__ret__, 'class_'),
        disk=pulumi.get(__ret__, 'disk'),
        id=pulumi.get(__ret__, 'id'),
        label=pulumi.get(__ret__, 'label'),
        memory=pulumi.get(__ret__, 'memory'),
        network_out=pulumi.get(__ret__, 'network_out'),
        price=pulumi.get(__ret__, 'price'),
        region_prices=pulumi.get(__ret__, 'region_prices'),
        transfer=pulumi.get(__ret__, 'transfer'),
        vcpus=pulumi.get(__ret__, 'vcpus'))


@_utilities.lift_output_func(get_instance_type)
def get_instance_type_output(id: Optional[pulumi.Input[str]] = None,
                             label: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInstanceTypeResult]:
    """
    Provides information about a Linode instance type
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-linode-type).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Instance type.

    ```python
    import pulumi
    import pulumi_linode as linode

    default = linode.get_instance_type(id="g6-standard-2")
    ```


    :param str id: Label used to identify instance type
    :param str label: The Linode Type's label is for display purposes only
    """
    ...
