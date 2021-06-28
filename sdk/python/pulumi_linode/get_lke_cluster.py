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
    'GetLkeClusterResult',
    'AwaitableGetLkeClusterResult',
    'get_lke_cluster',
]

@pulumi.output_type
class GetLkeClusterResult:
    """
    A collection of values returned by getLkeCluster.
    """
    def __init__(__self__, api_endpoints=None, id=None, k8s_version=None, kubeconfig=None, label=None, pools=None, region=None, status=None, tags=None):
        if api_endpoints and not isinstance(api_endpoints, list):
            raise TypeError("Expected argument 'api_endpoints' to be a list")
        pulumi.set(__self__, "api_endpoints", api_endpoints)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if k8s_version and not isinstance(k8s_version, str):
            raise TypeError("Expected argument 'k8s_version' to be a str")
        pulumi.set(__self__, "k8s_version", k8s_version)
        if kubeconfig and not isinstance(kubeconfig, str):
            raise TypeError("Expected argument 'kubeconfig' to be a str")
        pulumi.set(__self__, "kubeconfig", kubeconfig)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if pools and not isinstance(pools, list):
            raise TypeError("Expected argument 'pools' to be a list")
        pulumi.set(__self__, "pools", pools)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="apiEndpoints")
    def api_endpoints(self) -> Sequence[str]:
        """
        The endpoints for the Kubernetes API server.
        """
        return pulumi.get(self, "api_endpoints")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        The ID of the node.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="k8sVersion")
    def k8s_version(self) -> str:
        """
        The Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`).
        """
        return pulumi.get(self, "k8s_version")

    @property
    @pulumi.getter
    def kubeconfig(self) -> str:
        """
        The base64 encoded kubeconfig for the Kubernetes cluster.
        """
        return pulumi.get(self, "kubeconfig")

    @property
    @pulumi.getter
    def label(self) -> str:
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def pools(self) -> Sequence['outputs.GetLkeClusterPoolResult']:
        """
        Node pools associated with this cluster.
        """
        return pulumi.get(self, "pools")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        This Kubernetes cluster's location.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the node. (`ready`, `not_ready`)
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        The tags applied to the cluster.
        """
        return pulumi.get(self, "tags")


class AwaitableGetLkeClusterResult(GetLkeClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLkeClusterResult(
            api_endpoints=self.api_endpoints,
            id=self.id,
            k8s_version=self.k8s_version,
            kubeconfig=self.kubeconfig,
            label=self.label,
            pools=self.pools,
            region=self.region,
            status=self.status,
            tags=self.tags)


def get_lke_cluster(id: Optional[int] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLkeClusterResult:
    """
    Provides details about an LKE Cluster.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    my_cluster = linode.get_lke_cluster(id=123)
    ```


    :param int id: The LKE Cluster's ID.
    """
    __args__ = dict()
    __args__['id'] = id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getLkeCluster:getLkeCluster', __args__, opts=opts, typ=GetLkeClusterResult).value

    return AwaitableGetLkeClusterResult(
        api_endpoints=__ret__.api_endpoints,
        id=__ret__.id,
        k8s_version=__ret__.k8s_version,
        kubeconfig=__ret__.kubeconfig,
        label=__ret__.label,
        pools=__ret__.pools,
        region=__ret__.region,
        status=__ret__.status,
        tags=__ret__.tags)
