# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = ['DomainRecordArgs', 'DomainRecord']

@pulumi.input_type
class DomainRecordArgs:
    def __init__(__self__, *,
                 domain_id: pulumi.Input[builtins.int],
                 record_type: pulumi.Input[builtins.str],
                 target: pulumi.Input[builtins.str],
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 port: Optional[pulumi.Input[builtins.int]] = None,
                 priority: Optional[pulumi.Input[builtins.int]] = None,
                 protocol: Optional[pulumi.Input[builtins.str]] = None,
                 service: Optional[pulumi.Input[builtins.str]] = None,
                 tag: Optional[pulumi.Input[builtins.str]] = None,
                 ttl_sec: Optional[pulumi.Input[builtins.int]] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None):
        """
        The set of arguments for constructing a DomainRecord resource.
        :param pulumi.Input[builtins.int] domain_id: The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[builtins.str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://techdocs.akamai.com/linode-api/reference/post-domain-record). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[builtins.str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
               
               - - -
        :param pulumi.Input[builtins.str] name: The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        :param pulumi.Input[builtins.int] port: The port this Record points to.
        :param pulumi.Input[builtins.int] priority: The priority of the target host. Lower values are preferred.
        :param pulumi.Input[builtins.str] protocol: The protocol this Record's service communicates with. Only valid for SRV records.
        :param pulumi.Input[builtins.str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[builtins.str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[builtins.int] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[builtins.int] weight: The relative weight of this Record. Higher values are preferred.
        """
        pulumi.set(__self__, "domain_id", domain_id)
        pulumi.set(__self__, "record_type", record_type)
        pulumi.set(__self__, "target", target)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if protocol is not None:
            pulumi.set(__self__, "protocol", protocol)
        if service is not None:
            pulumi.set(__self__, "service", service)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)
        if ttl_sec is not None:
            pulumi.set(__self__, "ttl_sec", ttl_sec)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> pulumi.Input[builtins.int]:
        """
        The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "domain_id")

    @domain_id.setter
    def domain_id(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "domain_id", value)

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> pulumi.Input[builtins.str]:
        """
        The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://techdocs.akamai.com/linode-api/reference/post-domain-record). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "record_type")

    @record_type.setter
    def record_type(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "record_type", value)

    @property
    @pulumi.getter
    def target(self) -> pulumi.Input[builtins.str]:
        """
        The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.

        - - -
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The port this Record points to.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The priority of the target host. Lower values are preferred.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The protocol this Record's service communicates with. Only valid for SRV records.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The service this Record identified. Only valid for SRV records.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The tag portion of a CAA record. It is invalid to set this on other record types.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "tag", value)

    @property
    @pulumi.getter(name="ttlSec")
    def ttl_sec(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        """
        return pulumi.get(self, "ttl_sec")

    @ttl_sec.setter
    def ttl_sec(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "ttl_sec", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The relative weight of this Record. Higher values are preferred.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "weight", value)


@pulumi.input_type
class _DomainRecordState:
    def __init__(__self__, *,
                 domain_id: Optional[pulumi.Input[builtins.int]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 port: Optional[pulumi.Input[builtins.int]] = None,
                 priority: Optional[pulumi.Input[builtins.int]] = None,
                 protocol: Optional[pulumi.Input[builtins.str]] = None,
                 record_type: Optional[pulumi.Input[builtins.str]] = None,
                 service: Optional[pulumi.Input[builtins.str]] = None,
                 tag: Optional[pulumi.Input[builtins.str]] = None,
                 target: Optional[pulumi.Input[builtins.str]] = None,
                 ttl_sec: Optional[pulumi.Input[builtins.int]] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering DomainRecord resources.
        :param pulumi.Input[builtins.int] domain_id: The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[builtins.str] name: The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        :param pulumi.Input[builtins.int] port: The port this Record points to.
        :param pulumi.Input[builtins.int] priority: The priority of the target host. Lower values are preferred.
        :param pulumi.Input[builtins.str] protocol: The protocol this Record's service communicates with. Only valid for SRV records.
        :param pulumi.Input[builtins.str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://techdocs.akamai.com/linode-api/reference/post-domain-record). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[builtins.str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[builtins.str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[builtins.str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
               
               - - -
        :param pulumi.Input[builtins.int] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[builtins.int] weight: The relative weight of this Record. Higher values are preferred.
        """
        if domain_id is not None:
            pulumi.set(__self__, "domain_id", domain_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if protocol is not None:
            pulumi.set(__self__, "protocol", protocol)
        if record_type is not None:
            pulumi.set(__self__, "record_type", record_type)
        if service is not None:
            pulumi.set(__self__, "service", service)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)
        if target is not None:
            pulumi.set(__self__, "target", target)
        if ttl_sec is not None:
            pulumi.set(__self__, "ttl_sec", ttl_sec)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "domain_id")

    @domain_id.setter
    def domain_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "domain_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The port this Record points to.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The priority of the target host. Lower values are preferred.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The protocol this Record's service communicates with. Only valid for SRV records.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://techdocs.akamai.com/linode-api/reference/post-domain-record). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "record_type")

    @record_type.setter
    def record_type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "record_type", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The service this Record identified. Only valid for SRV records.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The tag portion of a CAA record. It is invalid to set this on other record types.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "tag", value)

    @property
    @pulumi.getter
    def target(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.

        - - -
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter(name="ttlSec")
    def ttl_sec(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        """
        return pulumi.get(self, "ttl_sec")

    @ttl_sec.setter
    def ttl_sec(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "ttl_sec", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The relative weight of this Record. Higher values are preferred.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "weight", value)


class DomainRecord(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_id: Optional[pulumi.Input[builtins.int]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 port: Optional[pulumi.Input[builtins.int]] = None,
                 priority: Optional[pulumi.Input[builtins.int]] = None,
                 protocol: Optional[pulumi.Input[builtins.str]] = None,
                 record_type: Optional[pulumi.Input[builtins.str]] = None,
                 service: Optional[pulumi.Input[builtins.str]] = None,
                 tag: Optional[pulumi.Input[builtins.str]] = None,
                 target: Optional[pulumi.Input[builtins.str]] = None,
                 ttl_sec: Optional[pulumi.Input[builtins.int]] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        """
        Provides a Linode Domain Record resource.  This can be used to create, modify, and delete Linodes Domain Records.
        For more information, see [DNS Manager](https://www.linode.com/docs/platform/manager/dns-manager/) and the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-domain-record).

        ## Example Usage

        The following example shows how one might use this resource to configure a Domain Record attached to a Linode Domain.

        ```python
        import pulumi
        import pulumi_linode as linode

        foobar = linode.Domain("foobar",
            type="master",
            domain="foobar.example",
            soa_email="example@foobar.example")
        foobar_domain_record = linode.DomainRecord("foobar",
            domain_id=foobar.id,
            name="www",
            record_type="CNAME",
            target="foobar.example")
        ```

        ## Import

        Linodes Domain Records can be imported using the Linode Domain `id` followed by the Domain Record `id` separated by a comma, e.g.

        ```sh
        $ pulumi import linode:index/domainRecord:DomainRecord www-foobar 1234567,7654321
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] domain_id: The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[builtins.str] name: The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        :param pulumi.Input[builtins.int] port: The port this Record points to.
        :param pulumi.Input[builtins.int] priority: The priority of the target host. Lower values are preferred.
        :param pulumi.Input[builtins.str] protocol: The protocol this Record's service communicates with. Only valid for SRV records.
        :param pulumi.Input[builtins.str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://techdocs.akamai.com/linode-api/reference/post-domain-record). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[builtins.str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[builtins.str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[builtins.str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
               
               - - -
        :param pulumi.Input[builtins.int] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[builtins.int] weight: The relative weight of this Record. Higher values are preferred.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainRecordArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Linode Domain Record resource.  This can be used to create, modify, and delete Linodes Domain Records.
        For more information, see [DNS Manager](https://www.linode.com/docs/platform/manager/dns-manager/) and the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-domain-record).

        ## Example Usage

        The following example shows how one might use this resource to configure a Domain Record attached to a Linode Domain.

        ```python
        import pulumi
        import pulumi_linode as linode

        foobar = linode.Domain("foobar",
            type="master",
            domain="foobar.example",
            soa_email="example@foobar.example")
        foobar_domain_record = linode.DomainRecord("foobar",
            domain_id=foobar.id,
            name="www",
            record_type="CNAME",
            target="foobar.example")
        ```

        ## Import

        Linodes Domain Records can be imported using the Linode Domain `id` followed by the Domain Record `id` separated by a comma, e.g.

        ```sh
        $ pulumi import linode:index/domainRecord:DomainRecord www-foobar 1234567,7654321
        ```

        :param str resource_name: The name of the resource.
        :param DomainRecordArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainRecordArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_id: Optional[pulumi.Input[builtins.int]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 port: Optional[pulumi.Input[builtins.int]] = None,
                 priority: Optional[pulumi.Input[builtins.int]] = None,
                 protocol: Optional[pulumi.Input[builtins.str]] = None,
                 record_type: Optional[pulumi.Input[builtins.str]] = None,
                 service: Optional[pulumi.Input[builtins.str]] = None,
                 tag: Optional[pulumi.Input[builtins.str]] = None,
                 target: Optional[pulumi.Input[builtins.str]] = None,
                 ttl_sec: Optional[pulumi.Input[builtins.int]] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainRecordArgs.__new__(DomainRecordArgs)

            if domain_id is None and not opts.urn:
                raise TypeError("Missing required property 'domain_id'")
            __props__.__dict__["domain_id"] = domain_id
            __props__.__dict__["name"] = name
            __props__.__dict__["port"] = port
            __props__.__dict__["priority"] = priority
            __props__.__dict__["protocol"] = protocol
            if record_type is None and not opts.urn:
                raise TypeError("Missing required property 'record_type'")
            __props__.__dict__["record_type"] = record_type
            __props__.__dict__["service"] = service
            __props__.__dict__["tag"] = tag
            if target is None and not opts.urn:
                raise TypeError("Missing required property 'target'")
            __props__.__dict__["target"] = target
            __props__.__dict__["ttl_sec"] = ttl_sec
            __props__.__dict__["weight"] = weight
        super(DomainRecord, __self__).__init__(
            'linode:index/domainRecord:DomainRecord',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain_id: Optional[pulumi.Input[builtins.int]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            port: Optional[pulumi.Input[builtins.int]] = None,
            priority: Optional[pulumi.Input[builtins.int]] = None,
            protocol: Optional[pulumi.Input[builtins.str]] = None,
            record_type: Optional[pulumi.Input[builtins.str]] = None,
            service: Optional[pulumi.Input[builtins.str]] = None,
            tag: Optional[pulumi.Input[builtins.str]] = None,
            target: Optional[pulumi.Input[builtins.str]] = None,
            ttl_sec: Optional[pulumi.Input[builtins.int]] = None,
            weight: Optional[pulumi.Input[builtins.int]] = None) -> 'DomainRecord':
        """
        Get an existing DomainRecord resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] domain_id: The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[builtins.str] name: The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        :param pulumi.Input[builtins.int] port: The port this Record points to.
        :param pulumi.Input[builtins.int] priority: The priority of the target host. Lower values are preferred.
        :param pulumi.Input[builtins.str] protocol: The protocol this Record's service communicates with. Only valid for SRV records.
        :param pulumi.Input[builtins.str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://techdocs.akamai.com/linode-api/reference/post-domain-record). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[builtins.str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[builtins.str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[builtins.str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
               
               - - -
        :param pulumi.Input[builtins.int] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[builtins.int] weight: The relative weight of this Record. Higher values are preferred.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainRecordState.__new__(_DomainRecordState)

        __props__.__dict__["domain_id"] = domain_id
        __props__.__dict__["name"] = name
        __props__.__dict__["port"] = port
        __props__.__dict__["priority"] = priority
        __props__.__dict__["protocol"] = protocol
        __props__.__dict__["record_type"] = record_type
        __props__.__dict__["service"] = service
        __props__.__dict__["tag"] = tag
        __props__.__dict__["target"] = target
        __props__.__dict__["ttl_sec"] = ttl_sec
        __props__.__dict__["weight"] = weight
        return DomainRecord(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> pulumi.Output[builtins.int]:
        """
        The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "domain_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        The port this Record points to.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        The priority of the target host. Lower values are preferred.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The protocol this Record's service communicates with. Only valid for SRV records.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> pulumi.Output[builtins.str]:
        """
        The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://techdocs.akamai.com/linode-api/reference/post-domain-record). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "record_type")

    @property
    @pulumi.getter
    def service(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The service this Record identified. Only valid for SRV records.
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter
    def tag(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The tag portion of a CAA record. It is invalid to set this on other record types.
        """
        return pulumi.get(self, "tag")

    @property
    @pulumi.getter
    def target(self) -> pulumi.Output[builtins.str]:
        """
        The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.

        - - -
        """
        return pulumi.get(self, "target")

    @property
    @pulumi.getter(name="ttlSec")
    def ttl_sec(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        """
        return pulumi.get(self, "ttl_sec")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        The relative weight of this Record. Higher values are preferred.
        """
        return pulumi.get(self, "weight")

