[![Build Status](https://travis-ci.com/pulumi/pulumi-linode.svg?token=eHg7Zp5zdDDJfTjY8ejq&branch=master)](https://travis-ci.com/pulumi/pulumi-linode)

# Linode Resource Provider

The Linode resource provider for Pulumi lets you use Linode resources in your cloud programs.  To use
this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/linode

or `yarn`:

    $ yarn add @pulumi/linode

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_linode

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-linode/sdk/go/...
    
## Configuration

The following configuration points are available:

- `linode:token` - (Required) This is your Linode APIv4 Token. May be specified using the `LINODE_TOKEN` environment variable.
- `linode:url` - (Optional) The HTTP(S) API address of the Linode API to use. May be specified using the `LINODE_URL` environment variable.
- `linode:uaPrefix` - (Optional) An HTTP User-Agent Prefix to prepend in API requests. May be specified using the `LINODE_UA_PREFIX` environment variable.

## Reference

For detailed reference documentation, please visit [the API docs](
https://pulumi.io/reference/pkg/nodejs/@pulumi/linode/index.html).
