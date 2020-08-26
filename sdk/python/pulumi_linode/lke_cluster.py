# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['LkeCluster']


class LkeCluster(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 k8s_version: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 pools: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['LkeClusterPoolArgs']]]]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages an LKE cluster.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_linode as linode

        my_cluster = linode.LkeCluster("my-cluster",
            k8s_version="1.17",
            label="my-cluster",
            pools=[linode.LkeClusterPoolArgs(
                count=3,
                type="g6-standard-2",
            )],
            region="us-central",
            tags=["prod"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] k8s_version: The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
        :param pulumi.Input[str] label: This Kubernetes cluster's unique label.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['LkeClusterPoolArgs']]]] pools: Additional nested attributes:
        :param pulumi.Input[str] region: This Kubernetes cluster's location.
        :param pulumi.Input[List[pulumi.Input[str]]] tags: An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
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

            if k8s_version is None:
                raise TypeError("Missing required property 'k8s_version'")
            __props__['k8s_version'] = k8s_version
            if label is None:
                raise TypeError("Missing required property 'label'")
            __props__['label'] = label
            if pools is None:
                raise TypeError("Missing required property 'pools'")
            __props__['pools'] = pools
            if region is None:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            __props__['tags'] = tags
            __props__['api_endpoints'] = None
            __props__['kubeconfig'] = None
            __props__['status'] = None
        super(LkeCluster, __self__).__init__(
            'linode:index/lkeCluster:LkeCluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_endpoints: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            k8s_version: Optional[pulumi.Input[str]] = None,
            kubeconfig: Optional[pulumi.Input[str]] = None,
            label: Optional[pulumi.Input[str]] = None,
            pools: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['LkeClusterPoolArgs']]]]] = None,
            region: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None) -> 'LkeCluster':
        """
        Get an existing LkeCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[List[pulumi.Input[str]]] api_endpoints: The endpoints for the Kubernetes API server.
        :param pulumi.Input[str] k8s_version: The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
        :param pulumi.Input[str] kubeconfig: The base64 encoded kubeconfig for the Kubernetes cluster.
        :param pulumi.Input[str] label: This Kubernetes cluster's unique label.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['LkeClusterPoolArgs']]]] pools: Additional nested attributes:
        :param pulumi.Input[str] region: This Kubernetes cluster's location.
        :param pulumi.Input[str] status: The status of the node.
        :param pulumi.Input[List[pulumi.Input[str]]] tags: An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["api_endpoints"] = api_endpoints
        __props__["k8s_version"] = k8s_version
        __props__["kubeconfig"] = kubeconfig
        __props__["label"] = label
        __props__["pools"] = pools
        __props__["region"] = region
        __props__["status"] = status
        __props__["tags"] = tags
        return LkeCluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiEndpoints")
    def api_endpoints(self) -> List[str]:
        """
        The endpoints for the Kubernetes API server.
        """
        return pulumi.get(self, "api_endpoints")

    @property
    @pulumi.getter(name="k8sVersion")
    def k8s_version(self) -> str:
        """
        The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
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
        This Kubernetes cluster's unique label.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def pools(self) -> List['outputs.LkeClusterPool']:
        """
        Additional nested attributes:
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
        The status of the node.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Optional[List[str]]:
        """
        An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

