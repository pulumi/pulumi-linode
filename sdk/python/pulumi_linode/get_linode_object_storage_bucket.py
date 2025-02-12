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

__all__ = [
    'GetLinodeObjectStorageBucketResult',
    'AwaitableGetLinodeObjectStorageBucketResult',
    'get_linode_object_storage_bucket',
    'get_linode_object_storage_bucket_output',
]

@pulumi.output_type
class GetLinodeObjectStorageBucketResult:
    """
    A collection of values returned by getLinodeObjectStorageBucket.
    """
    def __init__(__self__, cluster=None, created=None, endpoint_type=None, hostname=None, id=None, label=None, objects=None, region=None, s3_endpoint=None, size=None):
        if cluster and not isinstance(cluster, str):
            raise TypeError("Expected argument 'cluster' to be a str")
        pulumi.set(__self__, "cluster", cluster)
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if endpoint_type and not isinstance(endpoint_type, str):
            raise TypeError("Expected argument 'endpoint_type' to be a str")
        pulumi.set(__self__, "endpoint_type", endpoint_type)
        if hostname and not isinstance(hostname, str):
            raise TypeError("Expected argument 'hostname' to be a str")
        pulumi.set(__self__, "hostname", hostname)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if objects and not isinstance(objects, int):
            raise TypeError("Expected argument 'objects' to be a int")
        pulumi.set(__self__, "objects", objects)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if s3_endpoint and not isinstance(s3_endpoint, str):
            raise TypeError("Expected argument 's3_endpoint' to be a str")
        pulumi.set(__self__, "s3_endpoint", s3_endpoint)
        if size and not isinstance(size, int):
            raise TypeError("Expected argument 'size' to be a int")
        pulumi.set(__self__, "size", size)

    @property
    @pulumi.getter
    @_utilities.deprecated("""The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`.""")
    def cluster(self) -> str:
        return pulumi.get(self, "cluster")

    @property
    @pulumi.getter
    def created(self) -> str:
        return pulumi.get(self, "created")

    @property
    @pulumi.getter(name="endpointType")
    def endpoint_type(self) -> str:
        return pulumi.get(self, "endpoint_type")

    @property
    @pulumi.getter
    def hostname(self) -> str:
        return pulumi.get(self, "hostname")

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
    def objects(self) -> int:
        return pulumi.get(self, "objects")

    @property
    @pulumi.getter
    def region(self) -> str:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="s3Endpoint")
    def s3_endpoint(self) -> str:
        return pulumi.get(self, "s3_endpoint")

    @property
    @pulumi.getter
    def size(self) -> int:
        return pulumi.get(self, "size")


class AwaitableGetLinodeObjectStorageBucketResult(GetLinodeObjectStorageBucketResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLinodeObjectStorageBucketResult(
            cluster=self.cluster,
            created=self.created,
            endpoint_type=self.endpoint_type,
            hostname=self.hostname,
            id=self.id,
            label=self.label,
            objects=self.objects,
            region=self.region,
            s3_endpoint=self.s3_endpoint,
            size=self.size)


def get_linode_object_storage_bucket(cluster: Optional[str] = None,
                                     label: Optional[str] = None,
                                     region: Optional[str] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLinodeObjectStorageBucketResult:
    """
    Provides information about a Linode Object Storage Bucket
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-bucket).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Object Storage Bucket.

    ```python
    import pulumi
    import pulumi_linode as linode

    my_bucket = linode.get_linode_object_storage_bucket(label="my-bucket",
        region="us-mia")
    ```


    :param str cluster: The ID of the Object Storage Cluster this bucket is in. Required if `region` is not configured.
    :param str label: The name of this bucket.
    :param str region: The ID of the region this bucket is in. Required if `cluster` is not configured.
    """
    __args__ = dict()
    __args__['cluster'] = cluster
    __args__['label'] = label
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getLinodeObjectStorageBucket:getLinodeObjectStorageBucket', __args__, opts=opts, typ=GetLinodeObjectStorageBucketResult).value

    return AwaitableGetLinodeObjectStorageBucketResult(
        cluster=pulumi.get(__ret__, 'cluster'),
        created=pulumi.get(__ret__, 'created'),
        endpoint_type=pulumi.get(__ret__, 'endpoint_type'),
        hostname=pulumi.get(__ret__, 'hostname'),
        id=pulumi.get(__ret__, 'id'),
        label=pulumi.get(__ret__, 'label'),
        objects=pulumi.get(__ret__, 'objects'),
        region=pulumi.get(__ret__, 'region'),
        s3_endpoint=pulumi.get(__ret__, 's3_endpoint'),
        size=pulumi.get(__ret__, 'size'))
def get_linode_object_storage_bucket_output(cluster: Optional[pulumi.Input[Optional[str]]] = None,
                                            label: Optional[pulumi.Input[str]] = None,
                                            region: Optional[pulumi.Input[Optional[str]]] = None,
                                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetLinodeObjectStorageBucketResult]:
    """
    Provides information about a Linode Object Storage Bucket
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-bucket).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Object Storage Bucket.

    ```python
    import pulumi
    import pulumi_linode as linode

    my_bucket = linode.get_linode_object_storage_bucket(label="my-bucket",
        region="us-mia")
    ```


    :param str cluster: The ID of the Object Storage Cluster this bucket is in. Required if `region` is not configured.
    :param str label: The name of this bucket.
    :param str region: The ID of the region this bucket is in. Required if `cluster` is not configured.
    """
    __args__ = dict()
    __args__['cluster'] = cluster
    __args__['label'] = label
    __args__['region'] = region
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getLinodeObjectStorageBucket:getLinodeObjectStorageBucket', __args__, opts=opts, typ=GetLinodeObjectStorageBucketResult)
    return __ret__.apply(lambda __response__: GetLinodeObjectStorageBucketResult(
        cluster=pulumi.get(__response__, 'cluster'),
        created=pulumi.get(__response__, 'created'),
        endpoint_type=pulumi.get(__response__, 'endpoint_type'),
        hostname=pulumi.get(__response__, 'hostname'),
        id=pulumi.get(__response__, 'id'),
        label=pulumi.get(__response__, 'label'),
        objects=pulumi.get(__response__, 'objects'),
        region=pulumi.get(__response__, 'region'),
        s3_endpoint=pulumi.get(__response__, 's3_endpoint'),
        size=pulumi.get(__response__, 'size')))
