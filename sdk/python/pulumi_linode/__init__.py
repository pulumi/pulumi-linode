# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

# Export this package's modules as members:
from .domain import *
from .domain_record import *
from .firewall import *
from .get_account import *
from .get_domain import *
from .get_domain_record import *
from .get_image import *
from .get_instance_type import *
from .get_networking_ip import *
from .get_object_storage_cluster import *
from .get_profile import *
from .get_region import *
from .get_ssh_key import *
from .get_stack_script import *
from .get_user import *
from .get_volume import *
from .image import *
from .instance import *
from .instance_ip import *
from .lke_cluster import *
from .node_balancer import *
from .node_balancer_config import *
from .node_balancer_node import *
from .object_storage_bucket import *
from .object_storage_key import *
from .object_storage_object import *
from .provider import *
from .rdns import *
from .ssh_key import *
from .stack_script import *
from .token import *
from .vlan import *
from .volume import *
from ._inputs import *
from . import outputs

# Make subpackages available:
from . import (
    config,
)

def _register_module():
    import pulumi
    from . import _utilities


    class Module(pulumi.runtime.ResourceModule):
        _version = _utilities.get_semver_version()

        def version(self):
            return Module._version

        def construct(self, name: str, typ: str, urn: str) -> pulumi.Resource:
            if typ == "linode:index/domain:Domain":
                return Domain(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/domainRecord:DomainRecord":
                return DomainRecord(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/firewall:Firewall":
                return Firewall(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/image:Image":
                return Image(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/instance:Instance":
                return Instance(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/instanceIp:InstanceIp":
                return InstanceIp(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/lkeCluster:LkeCluster":
                return LkeCluster(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/nodeBalancer:NodeBalancer":
                return NodeBalancer(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/nodeBalancerConfig:NodeBalancerConfig":
                return NodeBalancerConfig(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/nodeBalancerNode:NodeBalancerNode":
                return NodeBalancerNode(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/objectStorageBucket:ObjectStorageBucket":
                return ObjectStorageBucket(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/objectStorageKey:ObjectStorageKey":
                return ObjectStorageKey(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/objectStorageObject:ObjectStorageObject":
                return ObjectStorageObject(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/rdns:Rdns":
                return Rdns(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/sshKey:SshKey":
                return SshKey(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/stackScript:StackScript":
                return StackScript(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/token:Token":
                return Token(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/vlan:Vlan":
                return Vlan(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "linode:index/volume:Volume":
                return Volume(name, pulumi.ResourceOptions(urn=urn))
            else:
                raise Exception(f"unknown resource type {typ}")


    _module_instance = Module()
    pulumi.runtime.register_resource_module("linode", "index/domain", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/domainRecord", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/firewall", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/image", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/instance", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/instanceIp", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/lkeCluster", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/nodeBalancer", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/nodeBalancerConfig", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/nodeBalancerNode", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/objectStorageBucket", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/objectStorageKey", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/objectStorageObject", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/rdns", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/sshKey", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/stackScript", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/token", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/vlan", _module_instance)
    pulumi.runtime.register_resource_module("linode", "index/volume", _module_instance)


    class Package(pulumi.runtime.ResourcePackage):
        _version = _utilities.get_semver_version()

        def version(self):
            return Package._version

        def construct_provider(self, name: str, typ: str, urn: str) -> pulumi.ProviderResource:
            if typ != "pulumi:providers:linode":
                raise Exception(f"unknown provider type {typ}")
            return Provider(name, pulumi.ResourceOptions(urn=urn))


    pulumi.runtime.register_resource_package("linode", Package())

_register_module()
