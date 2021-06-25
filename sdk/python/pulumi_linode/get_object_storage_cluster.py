# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetObjectStorageClusterResult',
    'AwaitableGetObjectStorageClusterResult',
    'get_object_storage_cluster',
]

@pulumi.output_type
class GetObjectStorageClusterResult:
    """
    A collection of values returned by getObjectStorageCluster.
    """
    def __init__(__self__, domain=None, id=None, region=None, static_site_domain=None, status=None):
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if static_site_domain and not isinstance(static_site_domain, str):
            raise TypeError("Expected argument 'static_site_domain' to be a str")
        pulumi.set(__self__, "static_site_domain", static_site_domain)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def domain(self) -> str:
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def region(self) -> str:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="staticSiteDomain")
    def static_site_domain(self) -> str:
        return pulumi.get(self, "static_site_domain")

    @property
    @pulumi.getter
    def status(self) -> str:
        return pulumi.get(self, "status")


class AwaitableGetObjectStorageClusterResult(GetObjectStorageClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetObjectStorageClusterResult(
            domain=self.domain,
            id=self.id,
            region=self.region,
            static_site_domain=self.static_site_domain,
            status=self.status)


def get_object_storage_cluster(domain: Optional[str] = None,
                               id: Optional[str] = None,
                               region: Optional[str] = None,
                               static_site_domain: Optional[str] = None,
                               status: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetObjectStorageClusterResult:
    """
    Provides information about a Linode Object Storage Cluster

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Object Storage Cluster.

    ```python
    import pulumi
    import pulumi_linode as linode

    primary = linode.get_object_storage_cluster(id="us-east-1")
    ```
    ## Attributes

    The Linode Object Storage Cluster resource exports the following attributes:

    * `domain` - The base URL for this cluster.

    * `status` - This cluster's status. (`available`, `unavailable`)

    * `region` - The region this cluster is located in. See all regions [here](https://api.linode.com/v4/regions).

    * `static_site_domain` - The base URL for this cluster used when hosting static sites.


    :param str id: The unique ID of this cluster.
    """
    __args__ = dict()
    __args__['domain'] = domain
    __args__['id'] = id
    __args__['region'] = region
    __args__['staticSiteDomain'] = static_site_domain
    __args__['status'] = status
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getObjectStorageCluster:getObjectStorageCluster', __args__, opts=opts, typ=GetObjectStorageClusterResult).value

    return AwaitableGetObjectStorageClusterResult(
        domain=__ret__.domain,
        id=__ret__.id,
        region=__ret__.region,
        static_site_domain=__ret__.static_site_domain,
        status=__ret__.status)
