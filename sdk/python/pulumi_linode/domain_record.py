# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class DomainRecord(pulumi.CustomResource):
    domain_id: pulumi.Output[float]
    """
    The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
    """
    name: pulumi.Output[str]
    """
    The name of this Record. Required for non-`SRV` records. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
    """
    port: pulumi.Output[float]
    """
    The port this Record points to.
    """
    priority: pulumi.Output[float]
    """
    The priority of the target host. Lower values are preferred.
    """
    protocol: pulumi.Output[str]
    """
    The protocol this Record's service communicates with. Only valid for SRV records.
    """
    record_type: pulumi.Output[str]
    """
    The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. *Changing `record_type` forces the creation of a new Linode Domain Record.*.
    """
    service: pulumi.Output[str]
    """
    The service this Record identified. Only valid for SRV records.
    """
    tag: pulumi.Output[str]
    """
    The tag portion of a CAA record. It is invalid to set this on other record types.
    """
    target: pulumi.Output[str]
    """
    The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
    - - -
    """
    ttl_sec: pulumi.Output[float]
    """
    'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
    """
    weight: pulumi.Output[float]
    """
    The relative weight of this Record. Higher values are preferred.
    """
    def __init__(__self__, resource_name, opts=None, domain_id=None, name=None, port=None, priority=None, protocol=None, record_type=None, service=None, tag=None, target=None, ttl_sec=None, weight=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Linode Domain Record resource.  This can be used to create, modify, and delete Linodes Domain Records.
        For more information, see [DNS Manager](https://www.linode.com/docs/platform/manager/dns-manager/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createDomainRecord).

        ## Attributes

        This resource exports no additional attributes.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/r/domain_record.html.md.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] domain_id: The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] name: The name of this Record. Required for non-`SRV` records. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        :param pulumi.Input[float] port: The port this Record points to.
        :param pulumi.Input[float] priority: The priority of the target host. Lower values are preferred.
        :param pulumi.Input[str] protocol: The protocol this Record's service communicates with. Only valid for SRV records.
        :param pulumi.Input[str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
               - - -
        :param pulumi.Input[float] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[float] weight: The relative weight of this Record. Higher values are preferred.
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

            if domain_id is None:
                raise TypeError("Missing required property 'domain_id'")
            __props__['domain_id'] = domain_id
            __props__['name'] = name
            __props__['port'] = port
            __props__['priority'] = priority
            __props__['protocol'] = protocol
            if record_type is None:
                raise TypeError("Missing required property 'record_type'")
            __props__['record_type'] = record_type
            __props__['service'] = service
            __props__['tag'] = tag
            if target is None:
                raise TypeError("Missing required property 'target'")
            __props__['target'] = target
            __props__['ttl_sec'] = ttl_sec
            __props__['weight'] = weight
        super(DomainRecord, __self__).__init__(
            'linode:index/domainRecord:DomainRecord',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, domain_id=None, name=None, port=None, priority=None, protocol=None, record_type=None, service=None, tag=None, target=None, ttl_sec=None, weight=None):
        """
        Get an existing DomainRecord resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] domain_id: The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] name: The name of this Record. Required for non-`SRV` records. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        :param pulumi.Input[float] port: The port this Record points to.
        :param pulumi.Input[float] priority: The priority of the target host. Lower values are preferred.
        :param pulumi.Input[str] protocol: The protocol this Record's service communicates with. Only valid for SRV records.
        :param pulumi.Input[str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
               - - -
        :param pulumi.Input[float] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[float] weight: The relative weight of this Record. Higher values are preferred.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["domain_id"] = domain_id
        __props__["name"] = name
        __props__["port"] = port
        __props__["priority"] = priority
        __props__["protocol"] = protocol
        __props__["record_type"] = record_type
        __props__["service"] = service
        __props__["tag"] = tag
        __props__["target"] = target
        __props__["ttl_sec"] = ttl_sec
        __props__["weight"] = weight
        return DomainRecord(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

