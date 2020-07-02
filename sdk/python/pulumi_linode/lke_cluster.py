# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables


class LkeCluster(pulumi.CustomResource):
    api_endpoints: pulumi.Output[list]
    """
    The endpoints for the Kubernetes API server.
    """
    k8s_version: pulumi.Output[str]
    """
    The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
    """
    kubeconfig: pulumi.Output[str]
    """
    The base64 encoded kubeconfig for the Kubernetes cluster.
    """
    label: pulumi.Output[str]
    """
    This Kubernetes cluster's unique label.
    """
    pools: pulumi.Output[list]
    """
    Additional nested attributes:

      * `count` (`float`) - The number of nodes in the Node Pool.
      * `id` (`float`) - The ID of the node.
      * `nodes` (`list`)
        * `id` (`str`) - The ID of the node.
        * `instanceId` (`float`) - The ID of the underlying Linode instance.
        * `status` (`str`) - The status of the node.

      * `type` (`str`) - A Linode Type for all of the nodes in the Node Pool.
    """
    region: pulumi.Output[str]
    """
    This Kubernetes cluster's location.
    """
    status: pulumi.Output[str]
    """
    The status of the node.
    """
    tags: pulumi.Output[list]
    """
    An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
    """
    def __init__(__self__, resource_name, opts=None, k8s_version=None, label=None, pools=None, region=None, tags=None, __props__=None, __name__=None, __opts__=None):
        """
        Manages an LKE cluster.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_linode as linode

        my_cluster = linode.LkeCluster("my-cluster",
            k8s_version="1.17",
            label="my-cluster",
            pools=[{
                "count": 3,
                "type": "g6-standard-2",
            }],
            region="us-central",
            tags=["prod"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] k8s_version: The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
        :param pulumi.Input[str] label: This Kubernetes cluster's unique label.
        :param pulumi.Input[list] pools: Additional nested attributes:
        :param pulumi.Input[str] region: This Kubernetes cluster's location.
        :param pulumi.Input[list] tags: An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.

        The **pools** object supports the following:

          * `count` (`pulumi.Input[float]`) - The number of nodes in the Node Pool.
          * `id` (`pulumi.Input[float]`) - The ID of the node.
          * `nodes` (`pulumi.Input[list]`)
            * `id` (`pulumi.Input[str]`) - The ID of the node.
            * `instanceId` (`pulumi.Input[float]`) - The ID of the underlying Linode instance.
            * `status` (`pulumi.Input[str]`) - The status of the node.

          * `type` (`pulumi.Input[str]`) - A Linode Type for all of the nodes in the Node Pool.
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
            opts.version = utilities.get_version()
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
    def get(resource_name, id, opts=None, api_endpoints=None, k8s_version=None, kubeconfig=None, label=None, pools=None, region=None, status=None, tags=None):
        """
        Get an existing LkeCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] api_endpoints: The endpoints for the Kubernetes API server.
        :param pulumi.Input[str] k8s_version: The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
        :param pulumi.Input[str] kubeconfig: The base64 encoded kubeconfig for the Kubernetes cluster.
        :param pulumi.Input[str] label: This Kubernetes cluster's unique label.
        :param pulumi.Input[list] pools: Additional nested attributes:
        :param pulumi.Input[str] region: This Kubernetes cluster's location.
        :param pulumi.Input[str] status: The status of the node.
        :param pulumi.Input[list] tags: An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.

        The **pools** object supports the following:

          * `count` (`pulumi.Input[float]`) - The number of nodes in the Node Pool.
          * `id` (`pulumi.Input[float]`) - The ID of the node.
          * `nodes` (`pulumi.Input[list]`)
            * `id` (`pulumi.Input[str]`) - The ID of the node.
            * `instanceId` (`pulumi.Input[float]`) - The ID of the underlying Linode instance.
            * `status` (`pulumi.Input[str]`) - The status of the node.

          * `type` (`pulumi.Input[str]`) - A Linode Type for all of the nodes in the Node Pool.
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

    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
