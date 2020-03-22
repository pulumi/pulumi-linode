# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class NodeBalancer(pulumi.CustomResource):
    client_conn_throttle: pulumi.Output[float]
    """
    Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
    """
    created: pulumi.Output[str]
    hostname: pulumi.Output[str]
    """
    This NodeBalancer's hostname, ending with .nodebalancer.linode.com
    """
    ipv4: pulumi.Output[str]
    """
    The Public IPv4 Address of this NodeBalancer
    """
    ipv6: pulumi.Output[str]
    """
    The Public IPv6 Address of this NodeBalancer
    """
    label: pulumi.Output[str]
    """
    The label of the Linode NodeBalancer
    """
    region: pulumi.Output[str]
    """
    The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
    """
    tags: pulumi.Output[list]
    """
    A list of tags applied to this object. Tags are for organizational purposes only.
    """
    transfer: pulumi.Output[dict]
    updated: pulumi.Output[str]
    def __init__(__self__, resource_name, opts=None, client_conn_throttle=None, label=None, region=None, tags=None, __props__=None, __name__=None, __opts__=None):
        """
        Create a NodeBalancer resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] client_conn_throttle: Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        :param pulumi.Input[str] label: The label of the Linode NodeBalancer
        :param pulumi.Input[str] region: The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        :param pulumi.Input[list] tags: A list of tags applied to this object. Tags are for organizational purposes only.
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

            __props__['client_conn_throttle'] = client_conn_throttle
            __props__['label'] = label
            if region is None:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            __props__['tags'] = tags
            __props__['created'] = None
            __props__['hostname'] = None
            __props__['ipv4'] = None
            __props__['ipv6'] = None
            __props__['transfer'] = None
            __props__['updated'] = None
        super(NodeBalancer, __self__).__init__(
            'linode:index/nodeBalancer:NodeBalancer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, client_conn_throttle=None, created=None, hostname=None, ipv4=None, ipv6=None, label=None, region=None, tags=None, transfer=None, updated=None):
        """
        Get an existing NodeBalancer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] client_conn_throttle: Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        :param pulumi.Input[str] hostname: This NodeBalancer's hostname, ending with .nodebalancer.linode.com
        :param pulumi.Input[str] ipv4: The Public IPv4 Address of this NodeBalancer
        :param pulumi.Input[str] ipv6: The Public IPv6 Address of this NodeBalancer
        :param pulumi.Input[str] label: The label of the Linode NodeBalancer
        :param pulumi.Input[str] region: The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        :param pulumi.Input[list] tags: A list of tags applied to this object. Tags are for organizational purposes only.

        The **transfer** object supports the following:

          * `in_` (`pulumi.Input[float]`)
          * `out` (`pulumi.Input[float]`)
          * `total` (`pulumi.Input[float]`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["client_conn_throttle"] = client_conn_throttle
        __props__["created"] = created
        __props__["hostname"] = hostname
        __props__["ipv4"] = ipv4
        __props__["ipv6"] = ipv6
        __props__["label"] = label
        __props__["region"] = region
        __props__["tags"] = tags
        __props__["transfer"] = transfer
        __props__["updated"] = updated
        return NodeBalancer(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

