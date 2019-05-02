# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class NodeBalancerConfig(pulumi.CustomResource):
    algorithm: pulumi.Output[str]
    """
    What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
    """
    check: pulumi.Output[str]
    """
    The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and http_body rely on the backend serving HTTP, and that the response returned matches what is expected.
    """
    check_attempts: pulumi.Output[float]
    """
    How many times to attempt a check before considering a backend to be down. (1-30)
    """
    check_body: pulumi.Output[str]
    check_interval: pulumi.Output[float]
    """
    How often, in seconds, to check that backends are up and serving requests.
    """
    check_passive: pulumi.Output[bool]
    """
    If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
    """
    check_path: pulumi.Output[str]
    """
    The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
    """
    check_timeout: pulumi.Output[float]
    """
    How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
    """
    cipher_suite: pulumi.Output[str]
    """
    What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
    """
    node_status: pulumi.Output[dict]
    nodebalancer_id: pulumi.Output[float]
    """
    The ID of the NodeBalancer to access.
    """
    port: pulumi.Output[float]
    """
    The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
    """
    protocol: pulumi.Output[str]
    """
    The protocol this port is configured to serve. If this is set to https you must include an ssl_cert and an ssl_key. (Defaults to "http")
    """
    ssl_cert: pulumi.Output[str]
    """
    The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
    """
    ssl_commonname: pulumi.Output[str]
    ssl_fingerprint: pulumi.Output[str]
    ssl_key: pulumi.Output[str]
    """
    The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
    """
    stickiness: pulumi.Output[str]
    """
    Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
    """
    def __init__(__self__, resource_name, opts=None, algorithm=None, check=None, check_attempts=None, check_body=None, check_interval=None, check_passive=None, check_path=None, check_timeout=None, cipher_suite=None, nodebalancer_id=None, port=None, protocol=None, ssl_cert=None, ssl_key=None, stickiness=None, __name__=None, __opts__=None):
        """
        Provides a Linode NodeBalancer Config resource.  This can be used to create, modify, and delete Linodes NodeBalancer Configs.
        For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancerConfig).
        
        The Linode Guide, [Create a NodeBalancer with Terraform](https://www.linode.com/docs/applications/configuration-management/create-a-nodebalancer-with-terraform/), provides step-by-step guidance and additional examples.
        
        ## Attributes
        
        This resource exports the following attributes:
        
        * `ssl_commonname` - The common name for the SSL certification this port is serving if this port is not configured to use SSL.
        
        * `ssl_fingerprint` - The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.
        
        * `node_status_up` - The number of backends considered to be 'UP' and healthy, and that are serving requests.
        
        * `node_status_down` - The number of backends considered to be 'DOWN' and unhealthy. These are not in rotation, and not serving requests.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
        :param pulumi.Input[str] check: The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and http_body rely on the backend serving HTTP, and that the response returned matches what is expected.
        :param pulumi.Input[float] check_attempts: How many times to attempt a check before considering a backend to be down. (1-30)
        :param pulumi.Input[float] check_interval: How often, in seconds, to check that backends are up and serving requests.
        :param pulumi.Input[bool] check_passive: If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
        :param pulumi.Input[str] check_path: The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
        :param pulumi.Input[float] check_timeout: How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
        :param pulumi.Input[str] cipher_suite: What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
        :param pulumi.Input[float] nodebalancer_id: The ID of the NodeBalancer to access.
        :param pulumi.Input[float] port: The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
        :param pulumi.Input[str] protocol: The protocol this port is configured to serve. If this is set to https you must include an ssl_cert and an ssl_key. (Defaults to "http")
        :param pulumi.Input[str] ssl_cert: The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
        :param pulumi.Input[str] ssl_key: The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
        :param pulumi.Input[str] stickiness: Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        __props__['algorithm'] = algorithm

        __props__['check'] = check

        __props__['check_attempts'] = check_attempts

        __props__['check_body'] = check_body

        __props__['check_interval'] = check_interval

        __props__['check_passive'] = check_passive

        __props__['check_path'] = check_path

        __props__['check_timeout'] = check_timeout

        __props__['cipher_suite'] = cipher_suite

        if nodebalancer_id is None:
            raise TypeError("Missing required property 'nodebalancer_id'")
        __props__['nodebalancer_id'] = nodebalancer_id

        __props__['port'] = port

        __props__['protocol'] = protocol

        __props__['ssl_cert'] = ssl_cert

        __props__['ssl_key'] = ssl_key

        __props__['stickiness'] = stickiness

        __props__['node_status'] = None
        __props__['ssl_commonname'] = None
        __props__['ssl_fingerprint'] = None

        super(NodeBalancerConfig, __self__).__init__(
            'linode:index/nodeBalancerConfig:NodeBalancerConfig',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

