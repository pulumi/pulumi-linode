# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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

__all__ = ['VpcArgs', 'Vpc']

@pulumi.input_type
class VpcArgs:
    def __init__(__self__, *,
                 label: pulumi.Input[_builtins.str],
                 region: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Vpc resource.
        :param pulumi.Input[_builtins.str] label: The label of the VPC. This field can only contain ASCII letters, digits and dashes.
        :param pulumi.Input[_builtins.str] region: The region of the VPC.
        :param pulumi.Input[_builtins.str] description: The user-defined description of this VPC.
        """
        pulumi.set(__self__, "label", label)
        pulumi.set(__self__, "region", region)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def label(self) -> pulumi.Input[_builtins.str]:
        """
        The label of the VPC. This field can only contain ASCII letters, digits and dashes.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "label", value)

    @_builtins.property
    @pulumi.getter
    def region(self) -> pulumi.Input[_builtins.str]:
        """
        The region of the VPC.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "region", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The user-defined description of this VPC.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _VpcState:
    def __init__(__self__, *,
                 created: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 label: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 updated: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Vpc resources.
        :param pulumi.Input[_builtins.str] created: The date and time when the VPC was created.
        :param pulumi.Input[_builtins.str] description: The user-defined description of this VPC.
        :param pulumi.Input[_builtins.str] label: The label of the VPC. This field can only contain ASCII letters, digits and dashes.
        :param pulumi.Input[_builtins.str] region: The region of the VPC.
        :param pulumi.Input[_builtins.str] updated: The date and time when the VPC was last updated.
        """
        if created is not None:
            pulumi.set(__self__, "created", created)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if updated is not None:
            pulumi.set(__self__, "updated", updated)

    @_builtins.property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The date and time when the VPC was created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The user-defined description of this VPC.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The label of the VPC. This field can only contain ASCII letters, digits and dashes.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "label", value)

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The region of the VPC.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)

    @_builtins.property
    @pulumi.getter
    def updated(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The date and time when the VPC was last updated.
        """
        return pulumi.get(self, "updated")

    @updated.setter
    def updated(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "updated", value)


@pulumi.type_token("linode:index/vpc:Vpc")
class Vpc(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 label: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Linode VPC.
        For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-vpc).

        Please refer to VpcSubnet to manage the subnets under a Linode VPC.

        ## Example Usage

        Create a VPC:

        ```python
        import pulumi
        import pulumi_linode as linode

        test = linode.Vpc("test",
            label="test-vpc",
            region="us-iad",
            description="My first VPC.")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The user-defined description of this VPC.
        :param pulumi.Input[_builtins.str] label: The label of the VPC. This field can only contain ASCII letters, digits and dashes.
        :param pulumi.Input[_builtins.str] region: The region of the VPC.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpcArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Linode VPC.
        For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-vpc).

        Please refer to VpcSubnet to manage the subnets under a Linode VPC.

        ## Example Usage

        Create a VPC:

        ```python
        import pulumi
        import pulumi_linode as linode

        test = linode.Vpc("test",
            label="test-vpc",
            region="us-iad",
            description="My first VPC.")
        ```

        :param str resource_name: The name of the resource.
        :param VpcArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 label: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcArgs.__new__(VpcArgs)

            __props__.__dict__["description"] = description
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__.__dict__["label"] = label
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["created"] = None
            __props__.__dict__["updated"] = None
        super(Vpc, __self__).__init__(
            'linode:index/vpc:Vpc',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            label: Optional[pulumi.Input[_builtins.str]] = None,
            region: Optional[pulumi.Input[_builtins.str]] = None,
            updated: Optional[pulumi.Input[_builtins.str]] = None) -> 'Vpc':
        """
        Get an existing Vpc resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] created: The date and time when the VPC was created.
        :param pulumi.Input[_builtins.str] description: The user-defined description of this VPC.
        :param pulumi.Input[_builtins.str] label: The label of the VPC. This field can only contain ASCII letters, digits and dashes.
        :param pulumi.Input[_builtins.str] region: The region of the VPC.
        :param pulumi.Input[_builtins.str] updated: The date and time when the VPC was last updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcState.__new__(_VpcState)

        __props__.__dict__["created"] = created
        __props__.__dict__["description"] = description
        __props__.__dict__["label"] = label
        __props__.__dict__["region"] = region
        __props__.__dict__["updated"] = updated
        return Vpc(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def created(self) -> pulumi.Output[_builtins.str]:
        """
        The date and time when the VPC was created.
        """
        return pulumi.get(self, "created")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[_builtins.str]:
        """
        The user-defined description of this VPC.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def label(self) -> pulumi.Output[_builtins.str]:
        """
        The label of the VPC. This field can only contain ASCII letters, digits and dashes.
        """
        return pulumi.get(self, "label")

    @_builtins.property
    @pulumi.getter
    def region(self) -> pulumi.Output[_builtins.str]:
        """
        The region of the VPC.
        """
        return pulumi.get(self, "region")

    @_builtins.property
    @pulumi.getter
    def updated(self) -> pulumi.Output[_builtins.str]:
        """
        The date and time when the VPC was last updated.
        """
        return pulumi.get(self, "updated")

