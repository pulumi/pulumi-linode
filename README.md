[![Actions Status](https://github.com/pulumi/pulumi-linode/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-linode/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Flinode.svg)](https://www.npmjs.com/package/@pulumi/linode)
[![Python version](https://badge.fury.io/py/pulumi-linode.svg)](https://pypi.org/project/pulumi-linode)
[![NuGet version](https://badge.fury.io/nu/pulumi.linode.svg)](https://badge.fury.io/nu/pulumi.linode)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-linode/sdk/v2/go)](https://pkg.go.dev/github.com/pulumi/pulumi-linode/sdk/v2/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-linode/blob/master/LICENSE)

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

    $ go get github.com/pulumi/pulumi-linode/sdk/v2/go/...

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Linode

## Configuration

The following configuration points are available:

- `linode:token` - (Required) This is your Linode APIv4 Token. May be specified using the `LINODE_TOKEN` environment variable.
- `linode:url` - (Optional) The HTTP(S) API address of the Linode API to use. May be specified using the `LINODE_URL` environment variable.
- `linode:uaPrefix` - (Optional) An HTTP User-Agent Prefix to prepend in API requests. May be specified using the `LINODE_UA_PREFIX` environment variable.

## Reference

For further information, please visit [the Linode provider docs](https://www.pulumi.com/docs/intro/cloud-providers/linode) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/linode).
