# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['DomainRecord']


class DomainRecord(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_id: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 record_type: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 tag: Optional[pulumi.Input[str]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 ttl_sec: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Linode Domain Record resource.  This can be used to create, modify, and delete Linodes Domain Records.
        For more information, see [DNS Manager](https://www.linode.com/docs/platform/manager/dns-manager/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createDomainRecord).

        ## Example Usage

        The following example shows how one might use this resource to configure a Domain Record attached to a Linode Domain.

        ```python
        import pulumi
        import pulumi_linode as linode

        foobar_domain = linode.Domain("foobarDomain",
            domain="foobar.example",
            soa_email="example@foobar.example",
            type="master")
        foobar_domain_record = linode.DomainRecord("foobarDomainRecord",
            domain_id=foobar_domain.id,
            name="www",
            record_type="CNAME",
            target="foobar.example")
        ```
        ## Attributes

        This resource exports no additional attributes.

        ## Import

        Linodes Domain Records can be imported using the Linode Domain `id` followed by the Domain Record `id` separated by a comma, e.g.

        ```sh
         $ pulumi import linode:index/domainRecord:DomainRecord www-foobar 1234567,7654321
        ```

         The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for Domain Records and other Linode resource types.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] domain_id: The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] name: The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        :param pulumi.Input[int] port: The port this Record points to.
        :param pulumi.Input[int] priority: The priority of the target host. Lower values are preferred.
        :param pulumi.Input[str] protocol: The protocol this Record's service communicates with. Only valid for SRV records.
        :param pulumi.Input[str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
        :param pulumi.Input[int] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[int] weight: The relative weight of this Record. Higher values are preferred.
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

            if domain_id is None and not opts.urn:
                raise TypeError("Missing required property 'domain_id'")
            __props__['domain_id'] = domain_id
            __props__['name'] = name
            __props__['port'] = port
            __props__['priority'] = priority
            __props__['protocol'] = protocol
            if record_type is None and not opts.urn:
                raise TypeError("Missing required property 'record_type'")
            __props__['record_type'] = record_type
            __props__['service'] = service
            __props__['tag'] = tag
            if target is None and not opts.urn:
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
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain_id: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[int]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            protocol: Optional[pulumi.Input[str]] = None,
            record_type: Optional[pulumi.Input[str]] = None,
            service: Optional[pulumi.Input[str]] = None,
            tag: Optional[pulumi.Input[str]] = None,
            target: Optional[pulumi.Input[str]] = None,
            ttl_sec: Optional[pulumi.Input[int]] = None,
            weight: Optional[pulumi.Input[int]] = None) -> 'DomainRecord':
        """
        Get an existing DomainRecord resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] domain_id: The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] name: The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        :param pulumi.Input[int] port: The port this Record points to.
        :param pulumi.Input[int] priority: The priority of the target host. Lower values are preferred.
        :param pulumi.Input[str] protocol: The protocol this Record's service communicates with. Only valid for SRV records.
        :param pulumi.Input[str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
        :param pulumi.Input[int] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[int] weight: The relative weight of this Record. Higher values are preferred.
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

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> pulumi.Output[int]:
        """
        The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "domain_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[Optional[int]]:
        """
        The port this Record points to.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[Optional[int]]:
        """
        The priority of the target host. Lower values are preferred.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Output[Optional[str]]:
        """
        The protocol this Record's service communicates with. Only valid for SRV records.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> pulumi.Output[str]:
        """
        The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "record_type")

    @property
    @pulumi.getter
    def service(self) -> pulumi.Output[Optional[str]]:
        """
        The service this Record identified. Only valid for SRV records.
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter
    def tag(self) -> pulumi.Output[Optional[str]]:
        """
        The tag portion of a CAA record. It is invalid to set this on other record types.
        """
        return pulumi.get(self, "tag")

    @property
    @pulumi.getter
    def target(self) -> pulumi.Output[str]:
        """
        The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
        """
        return pulumi.get(self, "target")

    @property
    @pulumi.getter(name="ttlSec")
    def ttl_sec(self) -> pulumi.Output[Optional[int]]:
        """
        'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        """
        return pulumi.get(self, "ttl_sec")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[Optional[int]]:
        """
        The relative weight of this Record. Higher values are preferred.
        """
        return pulumi.get(self, "weight")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

