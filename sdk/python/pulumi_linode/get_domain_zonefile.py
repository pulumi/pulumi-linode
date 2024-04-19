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
    'GetDomainZonefileResult',
    'AwaitableGetDomainZonefileResult',
    'get_domain_zonefile',
    'get_domain_zonefile_output',
]

@pulumi.output_type
class GetDomainZonefileResult:
    """
    A collection of values returned by getDomainZonefile.
    """
    def __init__(__self__, domain_id=None, id=None, zone_files=None):
        if domain_id and not isinstance(domain_id, int):
            raise TypeError("Expected argument 'domain_id' to be a int")
        pulumi.set(__self__, "domain_id", domain_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if zone_files and not isinstance(zone_files, list):
            raise TypeError("Expected argument 'zone_files' to be a list")
        pulumi.set(__self__, "zone_files", zone_files)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> int:
        """
        The associated domain's unique ID.
        """
        return pulumi.get(self, "domain_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="zoneFiles")
    def zone_files(self) -> Sequence[str]:
        """
        Array of strings representing the Domain Zonefile.
        """
        return pulumi.get(self, "zone_files")


class AwaitableGetDomainZonefileResult(GetDomainZonefileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDomainZonefileResult(
            domain_id=self.domain_id,
            id=self.id,
            zone_files=self.zone_files)


def get_domain_zonefile(domain_id: Optional[int] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDomainZonefileResult:
    """
    Provides information about a Linode Domain Zonefile.

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Domain Zonefile.

    ```python
    import pulumi
    import pulumi_linode as linode

    my_zonefile = linode.get_domain_zonefile(domain_id=3150401)
    ```


    :param int domain_id: The associated domain's unique ID.
    """
    __args__ = dict()
    __args__['domainId'] = domain_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getDomainZonefile:getDomainZonefile', __args__, opts=opts, typ=GetDomainZonefileResult).value

    return AwaitableGetDomainZonefileResult(
        domain_id=pulumi.get(__ret__, 'domain_id'),
        id=pulumi.get(__ret__, 'id'),
        zone_files=pulumi.get(__ret__, 'zone_files'))


@_utilities.lift_output_func(get_domain_zonefile)
def get_domain_zonefile_output(domain_id: Optional[pulumi.Input[int]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDomainZonefileResult]:
    """
    Provides information about a Linode Domain Zonefile.

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Domain Zonefile.

    ```python
    import pulumi
    import pulumi_linode as linode

    my_zonefile = linode.get_domain_zonefile(domain_id=3150401)
    ```


    :param int domain_id: The associated domain's unique ID.
    """
    ...
