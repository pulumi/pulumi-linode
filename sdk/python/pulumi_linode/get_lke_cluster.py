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

__all__ = [
    'GetLkeClusterResult',
    'AwaitableGetLkeClusterResult',
    'get_lke_cluster',
    'get_lke_cluster_output',
]

@pulumi.output_type
class GetLkeClusterResult:
    """
    A collection of values returned by getLkeCluster.
    """
    def __init__(__self__, api_endpoints=None, control_planes=None, created=None, dashboard_url=None, id=None, k8s_version=None, kubeconfig=None, label=None, pools=None, region=None, status=None, tags=None, updated=None):
        if api_endpoints and not isinstance(api_endpoints, list):
            raise TypeError("Expected argument 'api_endpoints' to be a list")
        pulumi.set(__self__, "api_endpoints", api_endpoints)
        if control_planes and not isinstance(control_planes, list):
            raise TypeError("Expected argument 'control_planes' to be a list")
        pulumi.set(__self__, "control_planes", control_planes)
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if dashboard_url and not isinstance(dashboard_url, str):
            raise TypeError("Expected argument 'dashboard_url' to be a str")
        pulumi.set(__self__, "dashboard_url", dashboard_url)
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
        if updated and not isinstance(updated, str):
            raise TypeError("Expected argument 'updated' to be a str")
        pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter(name="apiEndpoints")
    def api_endpoints(self) -> Sequence[str]:
        """
        The endpoints for the Kubernetes API server.
        """
        return pulumi.get(self, "api_endpoints")

    @property
    @pulumi.getter(name="controlPlanes")
    def control_planes(self) -> Optional[Sequence['outputs.GetLkeClusterControlPlaneResult']]:
        return pulumi.get(self, "control_planes")

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        When this Kubernetes cluster was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter(name="dashboardUrl")
    def dashboard_url(self) -> str:
        """
        The Kubernetes Dashboard access URL for this cluster.
        """
        return pulumi.get(self, "dashboard_url")

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
        """
        The unique label for the cluster.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def pools(self) -> Optional[Sequence['outputs.GetLkeClusterPoolResult']]:
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
        An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def updated(self) -> str:
        """
        When this Kubernetes cluster was updated.
        """
        return pulumi.get(self, "updated")


class AwaitableGetLkeClusterResult(GetLkeClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLkeClusterResult(
            api_endpoints=self.api_endpoints,
            control_planes=self.control_planes,
            created=self.created,
            dashboard_url=self.dashboard_url,
            id=self.id,
            k8s_version=self.k8s_version,
            kubeconfig=self.kubeconfig,
            label=self.label,
            pools=self.pools,
            region=self.region,
            status=self.status,
            tags=self.tags,
            updated=self.updated)


def get_lke_cluster(control_planes: Optional[Sequence[pulumi.InputType['GetLkeClusterControlPlaneArgs']]] = None,
                    id: Optional[int] = None,
                    pools: Optional[Sequence[pulumi.InputType['GetLkeClusterPoolArgs']]] = None,
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
    :param Sequence[pulumi.InputType['GetLkeClusterPoolArgs']] pools: Node pools associated with this cluster.
    """
    __args__ = dict()
    __args__['controlPlanes'] = control_planes
    __args__['id'] = id
    __args__['pools'] = pools
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getLkeCluster:getLkeCluster', __args__, opts=opts, typ=GetLkeClusterResult).value

    return AwaitableGetLkeClusterResult(
        api_endpoints=pulumi.get(__ret__, 'api_endpoints'),
        control_planes=pulumi.get(__ret__, 'control_planes'),
        created=pulumi.get(__ret__, 'created'),
        dashboard_url=pulumi.get(__ret__, 'dashboard_url'),
        id=pulumi.get(__ret__, 'id'),
        k8s_version=pulumi.get(__ret__, 'k8s_version'),
        kubeconfig=pulumi.get(__ret__, 'kubeconfig'),
        label=pulumi.get(__ret__, 'label'),
        pools=pulumi.get(__ret__, 'pools'),
        region=pulumi.get(__ret__, 'region'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        updated=pulumi.get(__ret__, 'updated'))


@_utilities.lift_output_func(get_lke_cluster)
def get_lke_cluster_output(control_planes: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetLkeClusterControlPlaneArgs']]]]] = None,
                           id: Optional[pulumi.Input[int]] = None,
                           pools: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetLkeClusterPoolArgs']]]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLkeClusterResult]:
    """
    Provides details about an LKE Cluster.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    my_cluster = linode.get_lke_cluster(id=123)
    ```


    :param int id: The LKE Cluster's ID.
    :param Sequence[pulumi.InputType['GetLkeClusterPoolArgs']] pools: Node pools associated with this cluster.
    """
    ...
