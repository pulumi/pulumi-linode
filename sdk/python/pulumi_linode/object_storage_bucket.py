# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ObjectStorageBucketArgs', 'ObjectStorageBucket']

@pulumi.input_type
class ObjectStorageBucketArgs:
    def __init__(__self__, *,
                 cluster: pulumi.Input[str],
                 label: pulumi.Input[str],
                 access_key: Optional[pulumi.Input[str]] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 cert: Optional[pulumi.Input['ObjectStorageBucketCertArgs']] = None,
                 cors_enabled: Optional[pulumi.Input[bool]] = None,
                 lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectStorageBucketLifecycleRuleArgs']]]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None,
                 versioning: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ObjectStorageBucket resource.
        :param pulumi.Input[str] cluster: The cluster of the Linode Object Storage Bucket.
        :param pulumi.Input[str] label: The label of the Linode Object Storage Bucket.
        :param pulumi.Input[str] access_key: The access key to authenticate with.
        :param pulumi.Input[str] acl: The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
        :param pulumi.Input['ObjectStorageBucketCertArgs'] cert: The cert used by this Object Storage Bucket.
        :param pulumi.Input[bool] cors_enabled: If true, the bucket will have CORS enabled for all origins.
        :param pulumi.Input[Sequence[pulumi.Input['ObjectStorageBucketLifecycleRuleArgs']]] lifecycle_rules: Lifecycle rules to be applied to the bucket.
        :param pulumi.Input[str] secret_key: The secret key to authenticate with.
        :param pulumi.Input[bool] versioning: Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)
               
               * `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)
               
               * `cert` - (Optional) The bucket's TLS/SSL certificate.
        """
        ObjectStorageBucketArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster=cluster,
            label=label,
            access_key=access_key,
            acl=acl,
            cert=cert,
            cors_enabled=cors_enabled,
            lifecycle_rules=lifecycle_rules,
            secret_key=secret_key,
            versioning=versioning,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster: Optional[pulumi.Input[str]] = None,
             label: Optional[pulumi.Input[str]] = None,
             access_key: Optional[pulumi.Input[str]] = None,
             acl: Optional[pulumi.Input[str]] = None,
             cert: Optional[pulumi.Input['ObjectStorageBucketCertArgs']] = None,
             cors_enabled: Optional[pulumi.Input[bool]] = None,
             lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectStorageBucketLifecycleRuleArgs']]]] = None,
             secret_key: Optional[pulumi.Input[str]] = None,
             versioning: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster is None:
            raise TypeError("Missing 'cluster' argument")
        if label is None:
            raise TypeError("Missing 'label' argument")
        if access_key is None and 'accessKey' in kwargs:
            access_key = kwargs['accessKey']
        if cors_enabled is None and 'corsEnabled' in kwargs:
            cors_enabled = kwargs['corsEnabled']
        if lifecycle_rules is None and 'lifecycleRules' in kwargs:
            lifecycle_rules = kwargs['lifecycleRules']
        if secret_key is None and 'secretKey' in kwargs:
            secret_key = kwargs['secretKey']

        _setter("cluster", cluster)
        _setter("label", label)
        if access_key is not None:
            _setter("access_key", access_key)
        if acl is not None:
            _setter("acl", acl)
        if cert is not None:
            _setter("cert", cert)
        if cors_enabled is not None:
            _setter("cors_enabled", cors_enabled)
        if lifecycle_rules is not None:
            _setter("lifecycle_rules", lifecycle_rules)
        if secret_key is not None:
            _setter("secret_key", secret_key)
        if versioning is not None:
            _setter("versioning", versioning)

    @property
    @pulumi.getter
    def cluster(self) -> pulumi.Input[str]:
        """
        The cluster of the Linode Object Storage Bucket.
        """
        return pulumi.get(self, "cluster")

    @cluster.setter
    def cluster(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster", value)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Input[str]:
        """
        The label of the Linode Object Storage Bucket.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[str]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> Optional[pulumi.Input[str]]:
        """
        The access key to authenticate with.
        """
        return pulumi.get(self, "access_key")

    @access_key.setter
    def access_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key", value)

    @property
    @pulumi.getter
    def acl(self) -> Optional[pulumi.Input[str]]:
        """
        The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
        """
        return pulumi.get(self, "acl")

    @acl.setter
    def acl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acl", value)

    @property
    @pulumi.getter
    def cert(self) -> Optional[pulumi.Input['ObjectStorageBucketCertArgs']]:
        """
        The cert used by this Object Storage Bucket.
        """
        return pulumi.get(self, "cert")

    @cert.setter
    def cert(self, value: Optional[pulumi.Input['ObjectStorageBucketCertArgs']]):
        pulumi.set(self, "cert", value)

    @property
    @pulumi.getter(name="corsEnabled")
    def cors_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the bucket will have CORS enabled for all origins.
        """
        return pulumi.get(self, "cors_enabled")

    @cors_enabled.setter
    def cors_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cors_enabled", value)

    @property
    @pulumi.getter(name="lifecycleRules")
    def lifecycle_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ObjectStorageBucketLifecycleRuleArgs']]]]:
        """
        Lifecycle rules to be applied to the bucket.
        """
        return pulumi.get(self, "lifecycle_rules")

    @lifecycle_rules.setter
    def lifecycle_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectStorageBucketLifecycleRuleArgs']]]]):
        pulumi.set(self, "lifecycle_rules", value)

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> Optional[pulumi.Input[str]]:
        """
        The secret key to authenticate with.
        """
        return pulumi.get(self, "secret_key")

    @secret_key.setter
    def secret_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_key", value)

    @property
    @pulumi.getter
    def versioning(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)

        * `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)

        * `cert` - (Optional) The bucket's TLS/SSL certificate.
        """
        return pulumi.get(self, "versioning")

    @versioning.setter
    def versioning(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "versioning", value)


@pulumi.input_type
class _ObjectStorageBucketState:
    def __init__(__self__, *,
                 access_key: Optional[pulumi.Input[str]] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 cert: Optional[pulumi.Input['ObjectStorageBucketCertArgs']] = None,
                 cluster: Optional[pulumi.Input[str]] = None,
                 cors_enabled: Optional[pulumi.Input[bool]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectStorageBucketLifecycleRuleArgs']]]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None,
                 versioning: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering ObjectStorageBucket resources.
        :param pulumi.Input[str] access_key: The access key to authenticate with.
        :param pulumi.Input[str] acl: The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
        :param pulumi.Input['ObjectStorageBucketCertArgs'] cert: The cert used by this Object Storage Bucket.
        :param pulumi.Input[str] cluster: The cluster of the Linode Object Storage Bucket.
        :param pulumi.Input[bool] cors_enabled: If true, the bucket will have CORS enabled for all origins.
        :param pulumi.Input[str] hostname: The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
               public.
        :param pulumi.Input[str] label: The label of the Linode Object Storage Bucket.
        :param pulumi.Input[Sequence[pulumi.Input['ObjectStorageBucketLifecycleRuleArgs']]] lifecycle_rules: Lifecycle rules to be applied to the bucket.
        :param pulumi.Input[str] secret_key: The secret key to authenticate with.
        :param pulumi.Input[bool] versioning: Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)
               
               * `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)
               
               * `cert` - (Optional) The bucket's TLS/SSL certificate.
        """
        _ObjectStorageBucketState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            access_key=access_key,
            acl=acl,
            cert=cert,
            cluster=cluster,
            cors_enabled=cors_enabled,
            hostname=hostname,
            label=label,
            lifecycle_rules=lifecycle_rules,
            secret_key=secret_key,
            versioning=versioning,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             access_key: Optional[pulumi.Input[str]] = None,
             acl: Optional[pulumi.Input[str]] = None,
             cert: Optional[pulumi.Input['ObjectStorageBucketCertArgs']] = None,
             cluster: Optional[pulumi.Input[str]] = None,
             cors_enabled: Optional[pulumi.Input[bool]] = None,
             hostname: Optional[pulumi.Input[str]] = None,
             label: Optional[pulumi.Input[str]] = None,
             lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectStorageBucketLifecycleRuleArgs']]]] = None,
             secret_key: Optional[pulumi.Input[str]] = None,
             versioning: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if access_key is None and 'accessKey' in kwargs:
            access_key = kwargs['accessKey']
        if cors_enabled is None and 'corsEnabled' in kwargs:
            cors_enabled = kwargs['corsEnabled']
        if lifecycle_rules is None and 'lifecycleRules' in kwargs:
            lifecycle_rules = kwargs['lifecycleRules']
        if secret_key is None and 'secretKey' in kwargs:
            secret_key = kwargs['secretKey']

        if access_key is not None:
            _setter("access_key", access_key)
        if acl is not None:
            _setter("acl", acl)
        if cert is not None:
            _setter("cert", cert)
        if cluster is not None:
            _setter("cluster", cluster)
        if cors_enabled is not None:
            _setter("cors_enabled", cors_enabled)
        if hostname is not None:
            _setter("hostname", hostname)
        if label is not None:
            _setter("label", label)
        if lifecycle_rules is not None:
            _setter("lifecycle_rules", lifecycle_rules)
        if secret_key is not None:
            _setter("secret_key", secret_key)
        if versioning is not None:
            _setter("versioning", versioning)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> Optional[pulumi.Input[str]]:
        """
        The access key to authenticate with.
        """
        return pulumi.get(self, "access_key")

    @access_key.setter
    def access_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key", value)

    @property
    @pulumi.getter
    def acl(self) -> Optional[pulumi.Input[str]]:
        """
        The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
        """
        return pulumi.get(self, "acl")

    @acl.setter
    def acl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acl", value)

    @property
    @pulumi.getter
    def cert(self) -> Optional[pulumi.Input['ObjectStorageBucketCertArgs']]:
        """
        The cert used by this Object Storage Bucket.
        """
        return pulumi.get(self, "cert")

    @cert.setter
    def cert(self, value: Optional[pulumi.Input['ObjectStorageBucketCertArgs']]):
        pulumi.set(self, "cert", value)

    @property
    @pulumi.getter
    def cluster(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster of the Linode Object Storage Bucket.
        """
        return pulumi.get(self, "cluster")

    @cluster.setter
    def cluster(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster", value)

    @property
    @pulumi.getter(name="corsEnabled")
    def cors_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the bucket will have CORS enabled for all origins.
        """
        return pulumi.get(self, "cors_enabled")

    @cors_enabled.setter
    def cors_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cors_enabled", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        """
        The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
        public.
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        The label of the Linode Object Storage Bucket.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="lifecycleRules")
    def lifecycle_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ObjectStorageBucketLifecycleRuleArgs']]]]:
        """
        Lifecycle rules to be applied to the bucket.
        """
        return pulumi.get(self, "lifecycle_rules")

    @lifecycle_rules.setter
    def lifecycle_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectStorageBucketLifecycleRuleArgs']]]]):
        pulumi.set(self, "lifecycle_rules", value)

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> Optional[pulumi.Input[str]]:
        """
        The secret key to authenticate with.
        """
        return pulumi.get(self, "secret_key")

    @secret_key.setter
    def secret_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_key", value)

    @property
    @pulumi.getter
    def versioning(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)

        * `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)

        * `cert` - (Optional) The bucket's TLS/SSL certificate.
        """
        return pulumi.get(self, "versioning")

    @versioning.setter
    def versioning(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "versioning", value)


class ObjectStorageBucket(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_key: Optional[pulumi.Input[str]] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 cert: Optional[pulumi.Input[pulumi.InputType['ObjectStorageBucketCertArgs']]] = None,
                 cluster: Optional[pulumi.Input[str]] = None,
                 cors_enabled: Optional[pulumi.Input[bool]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectStorageBucketLifecycleRuleArgs']]]]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None,
                 versioning: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Provides a Linode Object Storage Bucket resource. This can be used to create, modify, and delete Linodes Object Storage Buckets.

        ## Example Usage

        The following example shows how one might use this resource to create an Object Storage Bucket:

        ```python
        import pulumi
        import pulumi_linode as linode

        primary = linode.get_object_storage_cluster(id="us-east-1")
        foobar = linode.ObjectStorageBucket("foobar",
            cluster=primary.id,
            label="mybucket")
        ```

        Creating an Object Storage Bucket with Lifecycle rules:

        ```python
        import pulumi
        import pulumi_linode as linode

        mykey = linode.ObjectStorageKey("mykey", label="image-access")
        mybucket = linode.ObjectStorageBucket("mybucket",
            access_key=mykey.access_key,
            secret_key=mykey.secret_key,
            cluster="us-east-1",
            label="mybucket",
            lifecycle_rules=[linode.ObjectStorageBucketLifecycleRuleArgs(
                id="my-rule",
                enabled=True,
                abort_incomplete_multipart_upload_days=5,
                expiration=linode.ObjectStorageBucketLifecycleRuleExpirationArgs(
                    date="2021-06-21",
                ),
            )])
        ```

        ## Import

        Linodes Object Storage Buckets can be imported using the resource `id` which is made of `cluster:label`, e.g.

        ```sh
         $ pulumi import linode:index/objectStorageBucket:ObjectStorageBucket mybucket us-east-1:foobar
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key: The access key to authenticate with.
        :param pulumi.Input[str] acl: The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
        :param pulumi.Input[pulumi.InputType['ObjectStorageBucketCertArgs']] cert: The cert used by this Object Storage Bucket.
        :param pulumi.Input[str] cluster: The cluster of the Linode Object Storage Bucket.
        :param pulumi.Input[bool] cors_enabled: If true, the bucket will have CORS enabled for all origins.
        :param pulumi.Input[str] label: The label of the Linode Object Storage Bucket.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectStorageBucketLifecycleRuleArgs']]]] lifecycle_rules: Lifecycle rules to be applied to the bucket.
        :param pulumi.Input[str] secret_key: The secret key to authenticate with.
        :param pulumi.Input[bool] versioning: Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)
               
               * `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)
               
               * `cert` - (Optional) The bucket's TLS/SSL certificate.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ObjectStorageBucketArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Linode Object Storage Bucket resource. This can be used to create, modify, and delete Linodes Object Storage Buckets.

        ## Example Usage

        The following example shows how one might use this resource to create an Object Storage Bucket:

        ```python
        import pulumi
        import pulumi_linode as linode

        primary = linode.get_object_storage_cluster(id="us-east-1")
        foobar = linode.ObjectStorageBucket("foobar",
            cluster=primary.id,
            label="mybucket")
        ```

        Creating an Object Storage Bucket with Lifecycle rules:

        ```python
        import pulumi
        import pulumi_linode as linode

        mykey = linode.ObjectStorageKey("mykey", label="image-access")
        mybucket = linode.ObjectStorageBucket("mybucket",
            access_key=mykey.access_key,
            secret_key=mykey.secret_key,
            cluster="us-east-1",
            label="mybucket",
            lifecycle_rules=[linode.ObjectStorageBucketLifecycleRuleArgs(
                id="my-rule",
                enabled=True,
                abort_incomplete_multipart_upload_days=5,
                expiration=linode.ObjectStorageBucketLifecycleRuleExpirationArgs(
                    date="2021-06-21",
                ),
            )])
        ```

        ## Import

        Linodes Object Storage Buckets can be imported using the resource `id` which is made of `cluster:label`, e.g.

        ```sh
         $ pulumi import linode:index/objectStorageBucket:ObjectStorageBucket mybucket us-east-1:foobar
        ```

        :param str resource_name: The name of the resource.
        :param ObjectStorageBucketArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ObjectStorageBucketArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ObjectStorageBucketArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_key: Optional[pulumi.Input[str]] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 cert: Optional[pulumi.Input[pulumi.InputType['ObjectStorageBucketCertArgs']]] = None,
                 cluster: Optional[pulumi.Input[str]] = None,
                 cors_enabled: Optional[pulumi.Input[bool]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectStorageBucketLifecycleRuleArgs']]]]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None,
                 versioning: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ObjectStorageBucketArgs.__new__(ObjectStorageBucketArgs)

            __props__.__dict__["access_key"] = access_key
            __props__.__dict__["acl"] = acl
            cert = _utilities.configure(cert, ObjectStorageBucketCertArgs, True)
            __props__.__dict__["cert"] = cert
            if cluster is None and not opts.urn:
                raise TypeError("Missing required property 'cluster'")
            __props__.__dict__["cluster"] = cluster
            __props__.__dict__["cors_enabled"] = cors_enabled
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__.__dict__["label"] = label
            __props__.__dict__["lifecycle_rules"] = lifecycle_rules
            __props__.__dict__["secret_key"] = secret_key
            __props__.__dict__["versioning"] = versioning
            __props__.__dict__["hostname"] = None
        super(ObjectStorageBucket, __self__).__init__(
            'linode:index/objectStorageBucket:ObjectStorageBucket',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_key: Optional[pulumi.Input[str]] = None,
            acl: Optional[pulumi.Input[str]] = None,
            cert: Optional[pulumi.Input[pulumi.InputType['ObjectStorageBucketCertArgs']]] = None,
            cluster: Optional[pulumi.Input[str]] = None,
            cors_enabled: Optional[pulumi.Input[bool]] = None,
            hostname: Optional[pulumi.Input[str]] = None,
            label: Optional[pulumi.Input[str]] = None,
            lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectStorageBucketLifecycleRuleArgs']]]]] = None,
            secret_key: Optional[pulumi.Input[str]] = None,
            versioning: Optional[pulumi.Input[bool]] = None) -> 'ObjectStorageBucket':
        """
        Get an existing ObjectStorageBucket resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key: The access key to authenticate with.
        :param pulumi.Input[str] acl: The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
        :param pulumi.Input[pulumi.InputType['ObjectStorageBucketCertArgs']] cert: The cert used by this Object Storage Bucket.
        :param pulumi.Input[str] cluster: The cluster of the Linode Object Storage Bucket.
        :param pulumi.Input[bool] cors_enabled: If true, the bucket will have CORS enabled for all origins.
        :param pulumi.Input[str] hostname: The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
               public.
        :param pulumi.Input[str] label: The label of the Linode Object Storage Bucket.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectStorageBucketLifecycleRuleArgs']]]] lifecycle_rules: Lifecycle rules to be applied to the bucket.
        :param pulumi.Input[str] secret_key: The secret key to authenticate with.
        :param pulumi.Input[bool] versioning: Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)
               
               * `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)
               
               * `cert` - (Optional) The bucket's TLS/SSL certificate.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ObjectStorageBucketState.__new__(_ObjectStorageBucketState)

        __props__.__dict__["access_key"] = access_key
        __props__.__dict__["acl"] = acl
        __props__.__dict__["cert"] = cert
        __props__.__dict__["cluster"] = cluster
        __props__.__dict__["cors_enabled"] = cors_enabled
        __props__.__dict__["hostname"] = hostname
        __props__.__dict__["label"] = label
        __props__.__dict__["lifecycle_rules"] = lifecycle_rules
        __props__.__dict__["secret_key"] = secret_key
        __props__.__dict__["versioning"] = versioning
        return ObjectStorageBucket(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> pulumi.Output[Optional[str]]:
        """
        The access key to authenticate with.
        """
        return pulumi.get(self, "access_key")

    @property
    @pulumi.getter
    def acl(self) -> pulumi.Output[Optional[str]]:
        """
        The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
        """
        return pulumi.get(self, "acl")

    @property
    @pulumi.getter
    def cert(self) -> pulumi.Output[Optional['outputs.ObjectStorageBucketCert']]:
        """
        The cert used by this Object Storage Bucket.
        """
        return pulumi.get(self, "cert")

    @property
    @pulumi.getter
    def cluster(self) -> pulumi.Output[str]:
        """
        The cluster of the Linode Object Storage Bucket.
        """
        return pulumi.get(self, "cluster")

    @property
    @pulumi.getter(name="corsEnabled")
    def cors_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, the bucket will have CORS enabled for all origins.
        """
        return pulumi.get(self, "cors_enabled")

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Output[str]:
        """
        The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
        public.
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        The label of the Linode Object Storage Bucket.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="lifecycleRules")
    def lifecycle_rules(self) -> pulumi.Output[Optional[Sequence['outputs.ObjectStorageBucketLifecycleRule']]]:
        """
        Lifecycle rules to be applied to the bucket.
        """
        return pulumi.get(self, "lifecycle_rules")

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> pulumi.Output[Optional[str]]:
        """
        The secret key to authenticate with.
        """
        return pulumi.get(self, "secret_key")

    @property
    @pulumi.getter
    def versioning(self) -> pulumi.Output[bool]:
        """
        Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)

        * `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)

        * `cert` - (Optional) The bucket's TLS/SSL certificate.
        """
        return pulumi.get(self, "versioning")

