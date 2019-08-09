# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class Rdns(pulumi.CustomResource):
    address: pulumi.Output[str]
    """
    The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
    """
    rdns: pulumi.Output[str]
    """
    The name of the RDNS address.
    """
    def __init__(__self__, resource_name, opts=None, address=None, rdns=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Linode RDNS resource.  This can be used to create and modify RDNS records.
        
        Linode RDNS names must have a matching address value in an A or AAAA record.  This A or AAAA name must be resolvable at the time the RDNS resource is being associated.
        
        For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/docs/v4#operation/updateIP) and the [Configure your Linode for Reverse DNS](https://www.linode.com/docs/networking/dns/configure-your-linode-for-reverse-dns-classic-manager/) guide.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        :param pulumi.Input[str] rdns: The name of the RDNS address.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/r/rdns.html.markdown.
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

            if address is None:
                raise TypeError("Missing required property 'address'")
            __props__['address'] = address
            if rdns is None:
                raise TypeError("Missing required property 'rdns'")
            __props__['rdns'] = rdns
        super(Rdns, __self__).__init__(
            'linode:index/rdns:Rdns',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, address=None, rdns=None):
        """
        Get an existing Rdns resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        :param pulumi.Input[str] rdns: The name of the RDNS address.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/r/rdns.html.markdown.
        """
        opts = pulumi.ResourceOptions(id=id) if opts is None else opts.merge(pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["address"] = address
        __props__["rdns"] = rdns
        return Rdns(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

