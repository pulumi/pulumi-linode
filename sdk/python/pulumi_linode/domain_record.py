# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DomainRecordArgs', 'DomainRecord']

@pulumi.input_type
class DomainRecordArgs:
    def __init__(__self__, *,
                 domain_id: pulumi.Input[int],
                 record_type: pulumi.Input[str],
                 target: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 tag: Optional[pulumi.Input[str]] = None,
                 ttl_sec: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a DomainRecord resource.
        :param pulumi.Input[int] domain_id: The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
               
               - - -
        :param pulumi.Input[str] name: The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        :param pulumi.Input[int] port: The port this Record points to.
        :param pulumi.Input[int] priority: The priority of the target host. Lower values are preferred.
        :param pulumi.Input[str] protocol: The protocol this Record's service communicates with. Only valid for SRV records.
        :param pulumi.Input[str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[int] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[int] weight: The relative weight of this Record. Higher values are preferred.
        """
        DomainRecordArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            domain_id=domain_id,
            record_type=record_type,
            target=target,
            name=name,
            port=port,
            priority=priority,
            protocol=protocol,
            service=service,
            tag=tag,
            ttl_sec=ttl_sec,
            weight=weight,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             domain_id: Optional[pulumi.Input[int]] = None,
             record_type: Optional[pulumi.Input[str]] = None,
             target: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             port: Optional[pulumi.Input[int]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             protocol: Optional[pulumi.Input[str]] = None,
             service: Optional[pulumi.Input[str]] = None,
             tag: Optional[pulumi.Input[str]] = None,
             ttl_sec: Optional[pulumi.Input[int]] = None,
             weight: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if domain_id is None and 'domainId' in kwargs:
            domain_id = kwargs['domainId']
        if domain_id is None:
            raise TypeError("Missing 'domain_id' argument")
        if record_type is None and 'recordType' in kwargs:
            record_type = kwargs['recordType']
        if record_type is None:
            raise TypeError("Missing 'record_type' argument")
        if target is None:
            raise TypeError("Missing 'target' argument")
        if ttl_sec is None and 'ttlSec' in kwargs:
            ttl_sec = kwargs['ttlSec']

        _setter("domain_id", domain_id)
        _setter("record_type", record_type)
        _setter("target", target)
        if name is not None:
            _setter("name", name)
        if port is not None:
            _setter("port", port)
        if priority is not None:
            _setter("priority", priority)
        if protocol is not None:
            _setter("protocol", protocol)
        if service is not None:
            _setter("service", service)
        if tag is not None:
            _setter("tag", tag)
        if ttl_sec is not None:
            _setter("ttl_sec", ttl_sec)
        if weight is not None:
            _setter("weight", weight)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> pulumi.Input[int]:
        """
        The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "domain_id")

    @domain_id.setter
    def domain_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "domain_id", value)

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> pulumi.Input[str]:
        """
        The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "record_type")

    @record_type.setter
    def record_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "record_type", value)

    @property
    @pulumi.getter
    def target(self) -> pulumi.Input[str]:
        """
        The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.

        - - -
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: pulumi.Input[str]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        The port this Record points to.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of the target host. Lower values are preferred.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input[str]]:
        """
        The protocol this Record's service communicates with. Only valid for SRV records.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[str]]:
        """
        The service this Record identified. Only valid for SRV records.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[str]]:
        """
        The tag portion of a CAA record. It is invalid to set this on other record types.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag", value)

    @property
    @pulumi.getter(name="ttlSec")
    def ttl_sec(self) -> Optional[pulumi.Input[int]]:
        """
        'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        """
        return pulumi.get(self, "ttl_sec")

    @ttl_sec.setter
    def ttl_sec(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ttl_sec", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        The relative weight of this Record. Higher values are preferred.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


@pulumi.input_type
class _DomainRecordState:
    def __init__(__self__, *,
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
                 weight: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering DomainRecord resources.
        :param pulumi.Input[int] domain_id: The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] name: The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        :param pulumi.Input[int] port: The port this Record points to.
        :param pulumi.Input[int] priority: The priority of the target host. Lower values are preferred.
        :param pulumi.Input[str] protocol: The protocol this Record's service communicates with. Only valid for SRV records.
        :param pulumi.Input[str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
               
               - - -
        :param pulumi.Input[int] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[int] weight: The relative weight of this Record. Higher values are preferred.
        """
        _DomainRecordState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            domain_id=domain_id,
            name=name,
            port=port,
            priority=priority,
            protocol=protocol,
            record_type=record_type,
            service=service,
            tag=tag,
            target=target,
            ttl_sec=ttl_sec,
            weight=weight,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
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
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if domain_id is None and 'domainId' in kwargs:
            domain_id = kwargs['domainId']
        if record_type is None and 'recordType' in kwargs:
            record_type = kwargs['recordType']
        if ttl_sec is None and 'ttlSec' in kwargs:
            ttl_sec = kwargs['ttlSec']

        if domain_id is not None:
            _setter("domain_id", domain_id)
        if name is not None:
            _setter("name", name)
        if port is not None:
            _setter("port", port)
        if priority is not None:
            _setter("priority", priority)
        if protocol is not None:
            _setter("protocol", protocol)
        if record_type is not None:
            _setter("record_type", record_type)
        if service is not None:
            _setter("service", service)
        if tag is not None:
            _setter("tag", tag)
        if target is not None:
            _setter("target", target)
        if ttl_sec is not None:
            _setter("ttl_sec", ttl_sec)
        if weight is not None:
            _setter("weight", weight)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "domain_id")

    @domain_id.setter
    def domain_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "domain_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        The port this Record points to.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of the target host. Lower values are preferred.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input[str]]:
        """
        The protocol this Record's service communicates with. Only valid for SRV records.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        """
        return pulumi.get(self, "record_type")

    @record_type.setter
    def record_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "record_type", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[str]]:
        """
        The service this Record identified. Only valid for SRV records.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[str]]:
        """
        The tag portion of a CAA record. It is invalid to set this on other record types.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag", value)

    @property
    @pulumi.getter
    def target(self) -> Optional[pulumi.Input[str]]:
        """
        The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.

        - - -
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter(name="ttlSec")
    def ttl_sec(self) -> Optional[pulumi.Input[int]]:
        """
        'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        """
        return pulumi.get(self, "ttl_sec")

    @ttl_sec.setter
    def ttl_sec(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ttl_sec", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        The relative weight of this Record. Higher values are preferred.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


class DomainRecord(pulumi.CustomResource):
    @overload
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
                 __props__=None):
        """
        Provides a Linode Domain Record resource.  This can be used to create, modify, and delete Linodes Domain Records.
        For more information, see [DNS Manager](https://www.linode.com/docs/platform/manager/dns-manager/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createDomainRecord).

        ## Example Usage

        The following example shows how one might use this resource to configure a Domain Record attached to a Linode Domain.

        ```python
        import pulumi
        import pulumi_linode as linode

        foobar_domain = linode.Domain("foobarDomain",
            type="master",
            domain="foobar.example",
            soa_email="example@foobar.example")
        foobar_domain_record = linode.DomainRecord("foobarDomainRecord",
            domain_id=foobar_domain.id,
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
        :param pulumi.Input[int] domain_id: The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] name: The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        :param pulumi.Input[int] port: The port this Record points to.
        :param pulumi.Input[int] priority: The priority of the target host. Lower values are preferred.
        :param pulumi.Input[str] protocol: The protocol this Record's service communicates with. Only valid for SRV records.
        :param pulumi.Input[str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
               
               - - -
        :param pulumi.Input[int] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[int] weight: The relative weight of this Record. Higher values are preferred.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainRecordArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Linode Domain Record resource.  This can be used to create, modify, and delete Linodes Domain Records.
        For more information, see [DNS Manager](https://www.linode.com/docs/platform/manager/dns-manager/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createDomainRecord).

        ## Example Usage

        The following example shows how one might use this resource to configure a Domain Record attached to a Linode Domain.

        ```python
        import pulumi
        import pulumi_linode as linode

        foobar_domain = linode.Domain("foobarDomain",
            type="master",
            domain="foobar.example",
            soa_email="example@foobar.example")
        foobar_domain_record = linode.DomainRecord("foobarDomainRecord",
            domain_id=foobar_domain.id,
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
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DomainRecordArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
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
        :param pulumi.Input[str] record_type: The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        :param pulumi.Input[str] service: The service this Record identified. Only valid for SRV records.
        :param pulumi.Input[str] tag: The tag portion of a CAA record. It is invalid to set this on other record types.
        :param pulumi.Input[str] target: The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
               
               - - -
        :param pulumi.Input[int] ttl_sec: 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        :param pulumi.Input[int] weight: The relative weight of this Record. Higher values are preferred.
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
        The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
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

        - - -
        """
        return pulumi.get(self, "target")

    @property
    @pulumi.getter(name="ttlSec")
    def ttl_sec(self) -> pulumi.Output[Optional[int]]:
        """
        'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        """
        return pulumi.get(self, "ttl_sec")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[Optional[int]]:
        """
        The relative weight of this Record. Higher values are preferred.
        """
        return pulumi.get(self, "weight")

